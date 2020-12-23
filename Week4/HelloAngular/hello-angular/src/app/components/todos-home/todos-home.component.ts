import { Component, OnInit } from '@angular/core';
import { Todo } from 'src/app/models/todo';
import { TodosService } from 'src/app/services/todos.service';

@Component({
  selector: 'app-todos-home',
  templateUrl: './todos-home.component.html',
  styleUrls: ['./todos-home.component.css']
})
export class TodosHomeComponent implements OnInit {

  

  todos:Todo[] = [];

  visibility:boolean = true;

  greeterDiv:boolean = true;

  name:string = "";

  constructor(private todosService:TodosService) { }

  ngOnInit(): void {
    this.todos=this.todosService.getAllTodos();
  }

  toggleVisibility(){
    this.visibility=!this.visibility;
  }

  submitName() {
    this.greeterDiv = false;
  }

}
