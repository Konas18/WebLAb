 import {Component, EventEmitter, Input, OnInit, Output} from '@angular/core';
 import {Todo} from "../../model/todo";

@Component({
  selector: 'app-todo-list-item-ui',
  templateUrl: './todo-list-item-ui.component.html',
  styleUrls: ['./todo-list-item-ui.component.css']
})
export class TodoListItemUiComponent implements OnInit {

  constructor() { }

  @Input()
  todo: Todo;

  @Output()
  delete = new EventEmitter<number>()

  @Output()
  toggle = new EventEmitter<number>()

  ngOnInit(): void {
  }

  onDelete(){
    this.delete.emit();
  }

  onToggle(event:Event){
    event.preventDefault();
    this.toggle.emit();
  }

}
