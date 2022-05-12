import { Component, OnInit } from '@angular/core';
import {TodoState} from "../../store/todo/todo.reducer";
import {TodoCreateAction, TodoDeleteAction, TodoEditAction, TodoToggleAction} from "../../store/todo/todo.actions";
import {select, Store} from "@ngrx/store";
import {todoListSelector} from "../../store/todo/todo-selectors";
import {Observable} from "rxjs";
import {Todo} from "../../model/todo";

@Component({
  selector: 'app-todo-widget',
  templateUrl: './todo-widget.component.html',
  styleUrls: ['./todo-widget.component.css']
})
export class TodoWidgetComponent implements OnInit {

  ngOnInit(): void {
  }

  todoList$: Observable<Todo[]> = this.store$.pipe(select(todoListSelector))

  constructor(private store$: Store<TodoState>) {}

  onCreate(name:string){
    console.log(name);
    this.store$.dispatch(new TodoCreateAction({name}));
  }

  onDelete(id: number){
    this.store$.dispatch(new TodoDeleteAction({id}));
  }

  onToggle(id: number) {
    this.store$.dispatch(new TodoToggleAction({id}));
  }

  onEdit(x: { id: number; name: string }) {
    this.store$.dispatch(new TodoEditAction({id: x.id, name: x.name}))
  }
}
