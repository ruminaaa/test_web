import { Component } from '@angular/core';
import { ContactService } from '../services/ContactService';


@Component({
  selector: 'app-contact-us',
  templateUrl: './contact-us.component.html',
  styleUrls: ['./contact-us.component.css']
})
export class ContactUsComponent {
  contact = {
    name: '',
    email: '',
    message: ''
  };

  constructor(private contactService: ContactService) {}

  onSubmit() {
    // Appeler le service pour envoyer les données du formulaire
    this.contactService.sendContactForm(this.contact).subscribe(
      (response) => {
        console.log('Message envoyé avec succès', response);
        // Vous pouvez ajouter un message de succès ici
      },
      (error) => {
        console.error('Erreur lors de l\'envoi du message', error);
        // Vous pouvez ajouter un message d'erreur ici
      }
    );
  }
}
