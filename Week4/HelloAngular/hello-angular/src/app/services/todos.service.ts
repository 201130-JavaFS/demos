import { Injectable } from '@angular/core';
import { Todo } from '../models/todo';

@Injectable({
  providedIn: 'root'
})
export class TodosService {

  todo1:Todo = new Todo(1, "Make a cup of tea before building a rad demo.", "Incomplete");

  todo2:Todo = new Todo(2, "Merge sort all of my socks before laundry day. P.S. I hate laundry days!", "Incomplete");
  
  

  todo3: Todo = new Todo(3, "Feed my pet python a snack.", "Incomplete");

  todo4: Todo = new Todo(4, "Have another cup of coffee before I go rehearse the script for my upcoming play: JavaScript.", "Incomplete")

  constructor() { }

  getAllTodos():Todo[]{
    return [this.todo1, this.todo2, this.todo3, this.todo4]
  }
}
