import {Component, EventEmitter, Input, OnInit, Output} from '@angular/core';
import {Todo} from "../../model/todo";

@Component({
  selector: 'app-todo-list-ui',
  templateUrl: './todo-list-ui.component.html',
  styleUrls: ['./todo-list-ui.component.css']
})
export class TodoListUiComponent implements OnInit {

  @Input()
  todoList: Todo[] = [];

  @Output()
  delete = new EventEmitter<number>()

  @Output()
  toggle = new EventEmitter<number>()

  @Output()
  edit = new EventEmitter<{ id: number, name: string }>()

  constructor() { }

  onDelete(id: number){
    this.delete.emit(id);
  }

  onToggle(id:number){
    this.toggle.emit(id);
  }

  ngOnInit() {
  }

  onEdit(name: string, id: number) {
    this.edit.emit({id, name});
  }
}
