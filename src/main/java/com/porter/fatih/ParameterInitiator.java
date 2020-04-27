package com.porter.fatih;

import com.porter.fatih.dao.HotelDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by serpilkuzu on 27/04/2020.
 */
@RestController
@RequestMapping(value = "initiator")
public class ParameterInitiator {


    @Autowired
    HotelDao hotelDao;

    @RequestMapping(value = "get", method = RequestMethod.POST)
    public ResponseEntity<Boolean> getParameter(@RequestParam(name = "userId") String userId, @RequestParam(name = "hotelCode") String hotelCode) {

        boolean inserted = hotelDao.insertHotelCode(userId, hotelCode);

        if (inserted) {
            return new ResponseEntity<>(inserted, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(inserted, HttpStatus.BAD_REQUEST);
        }

    }

}
