package com.geovannycode.kotlingraphql

import jakarta.persistence.CascadeType
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import jakarta.persistence.OneToMany

@Entity
data class Hotel(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    val name: String,
    val address: String,
    val city: String,
    val totalRooms: Int,

    @OneToMany(mappedBy = "hotel", cascade = [CascadeType.ALL])
    val rooms: List<Room> = emptyList()
) {
    constructor() : this(0, "", "", "", 0, emptyList())
}

@Entity
data class Room(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    val roomNumber: String,
    val noOfBed: Int,
    val available: Boolean,

    @ManyToOne
    @JoinColumn(name = "hotel_id")
    val hotel: Hotel? = null
) {
    constructor() : this(0, "", 0, false, null)
}