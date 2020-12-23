export class Todo {
  id:number;
  content:string;
  status:string;

  constructor(id:number, content:string, status:string){
    this.id=id;
    this.content=content;
    this.status=status
  }
}
