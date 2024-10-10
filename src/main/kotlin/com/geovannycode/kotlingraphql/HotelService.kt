package com.geovannycode.kotlingraphql

import org.springframework.stereotype.Service

@Service
class HotelService(
    private val hotelRepository: HotelRepository
) {
    fun getAllHotels(): List<Hotel> {
        return hotelRepository.findAll()
    }

    fun getHotelById(id: Long): Hotel? {
        return hotelRepository.findById(id).orElse(null)
    }

   fun createHotel(hotel: Hotel): Hotel {
        return hotelRepository.save(hotel)
    }

    fun updateHotel(id: Long, hotel: Hotel): Hotel? {
        return hotelRepository.findById(id).map {
            val updatedHotel = it.copy(
                name = hotel.name,
                address = hotel.address,
                city = hotel.city,
                totalRooms = hotel.totalRooms,
                rooms = hotel.rooms
            )
            hotelRepository.save(updatedHotel)
        }.orElse(null)
    }
}