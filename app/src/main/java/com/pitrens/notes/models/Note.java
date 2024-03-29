package com.pitrens.notes.models;

public class Note {
  private String title;
  private  String content;
  private String timeStamp;

  public Note(String title, String content, String timeStamp) {
    this.title = title;
    this.content = content;
    this.timeStamp = timeStamp;
  }

  public Note(){
    this.title = "No title";
    this.content = "No Content";
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public String getTimeStamp() {
    return timeStamp;
  }

  public void setTimeStamp(String timeStamp) {
    this.timeStamp = timeStamp;
  }

  @Override
  public String toString() {
    return "Note{" +
        "title='" + title + '\'' +
        ", content='" + content + '\'' +
        ", timeStamp='" + timeStamp + '\'' +
        '}';
  }
}
