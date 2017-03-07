import { Injectable } from '@angular/core';
import { Persona } from './persona';
import { Http, Response, Headers, RequestOptions } from "@angular/http";
import 'rxjs/Rx';


@Injectable()
export class PersonaDataService {

  public result: String;
  constructor(private http: Http) {
  }

  addPersona(persona: Persona) {
    let headers = new Headers();
    headers.append('Content-Type', 'application/json');
    let options = new RequestOptions({ headers: headers });
    let body = JSON.stringify(persona);
    this.http.post('http://localhost:9000/vitae/personas', body, options)
      .map(res => res.json())
      .subscribe(
      data => this.result = data,
      err => console.log('ERROR!!!'),
      () => console.log('Got response from API', this.result)
      );
  }

}
