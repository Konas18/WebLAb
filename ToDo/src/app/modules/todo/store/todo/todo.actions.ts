import {Action} from "@ngrx/store";

export enum todoActionsType {
  create = "[TODO] create Todo item"
}

export class TodoCreateAction implements Action{
  readonly type = todoActionsType.create;
  constructor(public payload:{name:String}) {
  }
}

export type TodoActions = TodoCreateAction;
