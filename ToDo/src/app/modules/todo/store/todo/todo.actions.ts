import {Action} from "@ngrx/store";

export enum todoActionsType {
  create = "[TODO] create Todo item",
  delete = "[TODO] delete Todo item",
  toggle = "[TODO] toggle Todo item",
  edit = "[TODO] edit Todo item",
}

export class TodoCreateAction implements Action{
  readonly type = todoActionsType.create;
  constructor(public payload:{name:String}) {
  }
}

export class TodoDeleteAction implements Action{
  readonly type = todoActionsType.delete;
  constructor(public payload:{id:number}) {
  }
}

export class TodoToggleAction implements Action{
  readonly type = todoActionsType.toggle;
  constructor(public payload:{id:number}) {
  }
}

export class TodoEditAction implements Action{
  readonly type = todoActionsType.edit;
  constructor(public payload:{id:number, name: string}) {
  }
}

export type TodoActions = TodoCreateAction | TodoDeleteAction | TodoToggleAction | TodoEditAction;
