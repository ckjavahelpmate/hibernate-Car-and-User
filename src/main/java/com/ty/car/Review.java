package com.ty.car;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name="Review")
public class Review {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id ;
private String subject ;
private String content ;
@CreationTimestamp
private LocalDateTime createDateTime ;
@UpdateTimestamp
private LocalDateTime updateDateTime ;
@Override
public String toString() {
	return "Review [id=" + id + ", subject=" + subject + ", content=" + content + ", createDateTime=" + createDateTime
			+ ", updateDateTime=" + updateDateTime + ", writerName=" + writername + "]";
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getSubject() {
	return subject;
}
public void setSubject(String subject) {
	this.subject = subject;
}
public String getContent() {
	return content;
}
public void setContent(String content) {
	this.content = content;
}
public LocalDateTime getCreateDateTime() {
	return createDateTime;
}
public void setCreateDateTime(LocalDateTime createDateTime) {
	this.createDateTime = createDateTime;
}
public LocalDateTime getUpdateDateTime() {
	return updateDateTime;
}
public void setUpdateDateTime(LocalDateTime updateDateTime) {
	this.updateDateTime = updateDateTime;
}
public String getWriterName() {
	return writername;
}
public void setWriterName(String writerName) {
	this.writername = writerName;
}
private String writername ;


}
