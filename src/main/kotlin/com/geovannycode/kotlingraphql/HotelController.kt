package com.geovannycode.kotlingraphql

import org.springframework.graphql.data.method.annotation.Argument
import org.springframework.graphql.data.method.annotation.MutationMapping
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.stereotype.Controller

@Controller
class HotelController(private val hotelService: HotelService) {

    @QueryMapping
    fun hotels() : List<Hotel> {
        return hotelService.getAllHotels()
    }

    @QueryMapping
    fun hotelById(@Argument id: Long): Hotel? {
        return hotelService.getHotelById(id)
    }

    @MutationMapping
    fun createHotel(@Argument name: String, @Argument address: String, @Argument city: String, @Argument totalRooms: Int): Hotel {
        val hotel = Hotel(
            id = 0,
            name = name,
            address = address,
            city = city,
            totalRooms = totalRooms,
            rooms = emptyList()
        )
        return hotelService.createHotel(hotel)
    }

    @MutationMapping
    fun updateHotel(@Argument id: Long, @Argument name: String, @Argument address: String, @Argument city: String, @Argument totalRooms: Int): Hotel? {
        val hotel = Hotel(
            id = id,
            name = name,
            address = address,
            city = city,
            totalRooms = totalRooms,
            rooms = emptyList()
        )
        return hotelService.updateHotel(id, hotel)
    }

}