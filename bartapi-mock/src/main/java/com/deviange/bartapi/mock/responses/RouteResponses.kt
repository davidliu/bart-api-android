package com.deviange.bartapi.mock.responses

object RouteResponses {
    const val help = """{
   "?xml":{
      "@version":"1.0",
      "@encoding":"utf-8"
   },
   "root":{
      "uri":{
         "#cdata-section":"http://api.bart.gov/api/route.aspx?cmd=help&json=y"
      },
      "message":{
         "help":{
            "#cdata-section":"Commands: help, routes, routeinfo "
         }
      }
   }
}"""

    const val routeInfo = """{
   "?xml":{
      "@version":"1.0",
      "@encoding":"utf-8"
   },
   "root":{
      "uri":{
         "#cdata-section":"http://api.bart.gov/api/route.aspx?cmd=routeinfo&route=6&json=y"
      },
      "sched_num":"43",
      "routes":{
         "route":{
            "name":"Daly City - Warm Springs/South Fremont",
            "abbr":"DALY-WARM",
            "routeID":"ROUTE 6",
            "number":"6",
            "origin":"DALY",
            "destination":"WARM",
            "direction":"",
            "hexcolor":"#339933",
            "color":"#339933",
            "holidays":"0",
            "num_stns":"20",
            "config":{
               "station":[
                  "DALY",
                  "BALB",
                  "GLEN",
                  "24TH",
                  "16TH",
                  "CIVC",
                  "POWL",
                  "MONT",
                  "EMBR",
                  "WOAK",
                  "LAKE",
                  "FTVL",
                  "COLS",
                  "SANL",
                  "BAYF",
                  "HAYW",
                  "SHAY",
                  "UCTY",
                  "FRMT",
                  "WARM"
               ]
            }
         }
      },
      "message":null
   }
}"""

    const val routes = """{
   "?xml":{
      "@version":"1.0",
      "@encoding":"utf-8"
   },
   "root":{
      "uri":{
         "#cdata-section":"http://api.bart.gov/api/route.aspx?cmd=routes&json=y"
      },
      "sched_num":"43",
      "routes":{
         "route":[
            {
               "name":"Pittsburg/Bay Point - SFIA/Millbrae",
               "abbr":"PITT-SFIA",
               "routeID":"ROUTE 1",
               "number":"1",
               "hexcolor":"#ffff33",
               "color":"#ffff33"
            },
            {
               "name":"Daly City - Dublin/Pleasanton",
               "abbr":"DALY-DUBL",
               "routeID":"ROUTE 12",
               "number":"12",
               "hexcolor":"#0099cc",
               "color":"#0099cc"
            },
            {
               "name":"Daly City - Warm Springs/South Fremont",
               "abbr":"DALY-WARM",
               "routeID":"ROUTE 6",
               "number":"6",
               "hexcolor":"#339933",
               "color":"#339933"
            },
            {
               "name":"Dublin/Pleasanton - Daly City",
               "abbr":"DUBL-DALY",
               "routeID":"ROUTE 11",
               "number":"11",
               "hexcolor":"#0099cc",
               "color":"#0099cc"
            },
            {
               "name":"Warm Springs/South Fremont - Daly City",
               "abbr":"WARM-DALY",
               "routeID":"ROUTE 5",
               "number":"5",
               "hexcolor":"#339933",
               "color":"#339933"
            },
            {
               "name":"Warm Springs/South Fremont - Richmond",
               "abbr":"WARM-RICH",
               "routeID":"ROUTE 3",
               "number":"3",
               "hexcolor":"#ff9933",
               "color":"#ff9933"
            },
            {
               "name":"Millbrae/Daly City - Richmond",
               "abbr":"MLBR-RICH",
               "routeID":"ROUTE 8",
               "number":"8",
               "hexcolor":"#ff0000",
               "color":"#ff0000"
            },
            {
               "name":"Richmond - Warm Springs/South Fremont",
               "abbr":"RICH-WARM",
               "routeID":"ROUTE 4",
               "number":"4",
               "hexcolor":"#ff9933",
               "color":"#ff9933"
            },
            {
               "name":"Richmond - Daly City/Millbrae",
               "abbr":"RICH-MLBR",
               "routeID":"ROUTE 7",
               "number":"7",
               "hexcolor":"",
               "color":"#ff0000"
            },
            {
               "name":"Millbrae/SFIA - Pittsburg/Bay Point",
               "abbr":"SFIA-PITT",
               "routeID":"ROUTE 2",
               "number":"2",
               "hexcolor":"#ffff33",
               "color":"#ffff33"
            },
            {
               "name":"Coliseum - Oakland Int'l Airport",
               "abbr":"COLS-OAKL",
               "routeID":"ROUTE 19",
               "number":"19",
               "hexcolor":"#d5cfa3",
               "color":"#d5cfa3"
            },
            {
               "name":"Oakland Int'l Airport - Coliseum",
               "abbr":"OAKL-COLS",
               "routeID":"ROUTE 20",
               "number":"20",
               "hexcolor":"#d5cfa3",
               "color":"#d5cfa3"
            }
         ]
      },
      "message":""
   }
}"""

    val commandMap = mapOf(
        "help" to help,
        "routeinfo" to routeInfo,
        "routes" to routes
    )
}