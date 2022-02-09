package com.api.parkingcontrol.models;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name="tb_parking_spot")
public class ParkingSpotModel implements Serializable{
	
	private static final long serialVersionUID=1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    
	@Column(nullable = false, unique = true, length = 10)
    private String parkingSpotNumber;
    
	@Column(nullable = false, unique = true, length = 7)
    private String licensePlateCar;
    
	@Column(nullable = false, length = 70)
    private String brandCar;
    
	@Column(nullable = false, length = 70)
    private String modelCar;
    
	@Column(nullable = false, length = 70)
    private String colorCar;
   
	@Column(nullable = false)
    private LocalDateTime registrationDate;
    
	@Column(nullable = false, length = 130)
    private String responsibleName;
    
	@Column(nullable = false, length = 30)
    private String apartment;
    
	@Column(nullable = false, length = 30)
    private String block;
}
