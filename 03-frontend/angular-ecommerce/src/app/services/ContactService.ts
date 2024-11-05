import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';


@Injectable({
  providedIn: 'root'
})
export class ContactService {
 

  private apiUrl = 'http://localhost:8080/api/contact';  // L'URL de votre API

  constructor(private http: HttpClient) {}
  sendContactForm(contact: any): Observable<any> {
    return this.http.post<any>(this.apiUrl, contact);
  }}
