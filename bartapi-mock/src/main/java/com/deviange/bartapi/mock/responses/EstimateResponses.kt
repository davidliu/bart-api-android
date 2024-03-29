package com.deviange.bartapi.mock.responses

object EstimateResponses {

    const val etd = """{
   "?xml":{
      "@version":"1.0",
      "@encoding":"utf-8"
   },
   "root":{
      "@id":"1",
      "uri":{
         "#cdata-section":"http://api.bart.gov/api/etd.aspx?cmd=etd&orig=RICH&json=y"
      },
      "date":"08/14/2017",
      "time":"10:20:31 AM PDT",
      "station":[
         {
            "name":"Richmond",
            "abbr":"RICH",
            "etd":[
               {
                  "destination":"Fremont",
                  "abbreviation":"FRMT",
                  "limited":"0",
                  "estimate":[
                     {
                        "minutes":"1",
                        "platform":"2",
                        "direction":"South",
                        "length":"4",
                        "color":"ORANGE",
                        "hexcolor":"#ff9933",
                        "bikeflag":"1",
                        "delay":"238"
                     },
                     {
                        "minutes":"13",
                        "platform":"2",
                        "direction":"South",
                        "length":"4",
                        "color":"ORANGE",
                        "hexcolor":"#ff9933",
                        "bikeflag":"1",
                        "delay":"0"
                     },
                     {
                        "minutes":"28",
                        "platform":"2",
                        "direction":"South",
                        "length":"4",
                        "color":"ORANGE",
                        "hexcolor":"#ff9933",
                        "bikeflag":"1",
                        "delay":"0"
                     }
                  ]
               },
               {
                  "destination":"Millbrae",
                  "abbreviation":"MLBR",
                  "limited":"0",
                  "estimate":[
                     {
                        "minutes":"6",
                        "platform":"2",
                        "direction":"South",
                        "length":"4",
                        "color":"RED",
                        "hexcolor":"#ff0000",
                        "bikeflag":"1",
                        "delay":"0"
                     },
                     {
                        "minutes":"21",
                        "platform":"2",
                        "direction":"South",
                        "length":"5",
                        "color":"RED",
                        "hexcolor":"#ff0000",
                        "bikeflag":"1",
                        "delay":"0"
                     },
                     {
                        "minutes":"36",
                        "platform":"2",
                        "direction":"South",
                        "length":"5",
                        "color":"RED",
                        "hexcolor":"#ff0000",
                        "bikeflag":"1",
                        "delay":"0"
                     }
                  ]
               }
            ]
         }
      ],
      "message":""
   }
}"""

    const val help = """{
   "?xml":{
      "@version":"1.0",
      "@encoding":"utf-8"
   },
   "root":{
      "uri":{
         "#cdata-section":"http://api.bart.gov/api/etd.aspx?cmd=help&json=y"
      },
      "message":{
         "help":{
            "#cdata-section":"Commands: etd, help "
         }
      }
   }
}"""
    val commandMap = mapOf(
        "etd" to etd,
        "help" to help
    )

}