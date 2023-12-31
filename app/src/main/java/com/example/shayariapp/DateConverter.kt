package com.example.shayariapp

import java.util.Date

class DateConverter {

      public fun toTimestamp(date: Date):Long?{
          return date?.time
      }

      public fun toDate(long: Long):Date{
          return long.let { Date(it) }
      }


  }