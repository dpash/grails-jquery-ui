package org.smop.grails.jqueryui

class TagException extends Exception {
  public TagException() {
    super()
  }

  public TagException(String message) {
    super(message)
  }

  public TagException(Throwable ex) {
    super(ex)
  }

  public TagException(String message, Throwable ex) {
    super(message, ex)
  }
}