package com.upgrad.bookmyconsultation.entity;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Primary;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import java.util.UUID;




//mark this class as an 'entity class'
//Use Data annotation to generate boilerplate code
//Use NoArgsConstructor annotation
//create a class name Rating
	//create a primary key called 'id' of type String
	//initialise id with a UUID using UUID.randomUUID
	//create appointmentId of type String
	//create doctorId of type String
	//create rating of type Integer
	//create comments of type String
	//Set access modifiers for all these members to 'private'
@NoArgsConstructor
@Entity
@Data
public class Rating {

    @Id
    String id;

    @Column
    String appointmentId;

    @Column
    String doctorId;

    @Column
    int rating;

    @Column
    String comments;
}
