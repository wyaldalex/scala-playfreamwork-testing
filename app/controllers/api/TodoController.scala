package controllers.api

import models.Todo
import play.api.libs.json._
import play.api.mvc._

import javax.inject._

class TodoController @Inject()(
                                cc: ControllerComponents
                              ) extends AbstractController(cc) {

  implicit val todoFormat = Json.format[Todo]

  def getAll = Action {
    val todo = new Todo(1, "item 1", false)
    val todo2 = new Todo(2, "item 2", false)
    val todosList = List(todo, todo2)
    Ok(Json.toJson(todosList))
  }
}
