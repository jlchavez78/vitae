import { Component } from '@angular/core';
import { PersonaDataService } from './persona/persona-data.service';
import { Persona } from './persona/persona';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
  providers: [PersonaDataService]
})
export class AppComponent {
  
  newPersona: Persona = new Persona();
  
  constructor(private personaDataService: PersonaDataService){
  }
  
  addPersona(){
    this.personaDataService.addPersona(this.newPersona);
    this.newPersona = new Persona();
  }
  
}
