export class Persona {
  id: number;
  nombre: string = '';
  primerApellido: string = '';
  segundoApellido: string = '';
  nif: string = '';
  telefono: string = '';
  movil: string = '';

  constructor(values: Object = {}) {
    Object.assign(this, values);
  }
}
let persona = new Persona({
  nombre: 'Name',
  primerApellido: 'Ape1',
  segunApellido: 'Ape2'
});

