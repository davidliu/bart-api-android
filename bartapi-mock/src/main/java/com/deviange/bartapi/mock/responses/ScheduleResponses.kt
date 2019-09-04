package com.deviange.bartapi.mock.responses

object ScheduleResponses {
    const val arrive = """{  
   "?xml":{  
      "@version":"1.0",
      "@encoding":"utf-8"
   },
   "root":{  
      "@id":"1",
      "uri":{  
         "#cdata-section":"http://api.bart.gov/api/sched.aspx?cmd=arrive&orig=ASHB&dest=CIVC&date=now&b=2&a=2&l=1&json=y"
      },
      "origin":"ASHB",
      "destination":"CIVC",
      "sched_num":"45",
      "schedule":{  
         "date":"Jan 2, 2018",
         "time":"9:51 AM",
         "before":"2",
         "after":"2",
         "request":{  
            "trip":[  
               {  
                  "@origin":"ASHB",
                  "@destination":"CIVC",
                  "@fare":"4.45",
                  "@origTimeMin":"9:12 AM",
                  "@origTimeDate":"01/02/2018 ",
                  "@destTimeMin":"9:37 AM",
                  "@destTimeDate":"01/02/2018",
                  "@clipper":"1.45",
                  "@tripTime":"25",
                  "fares":{  
                     "@level":"normal",
                     "fare":[  
                        {  
                           "@amount":"3.95",
                           "@class":"clipper",
                           "@name":"Clipper"
                        },
                        {  
                           "@amount":"4.45",
                           "@class":"cash",
                           "@name":"BART Blue Ticket"
                        },
                        {  
                           "@amount":"1.45",
                           "@class":"rtcclipper",
                           "@name":"Senior/Disabled Clipper"
                        },
                        {  
                           "@amount":"1.95",
                           "@class":"student",
                           "@name":"Youth Clipper"
                        }
                     ]
                  },
                  "leg":[  
                     {  
                        "@order":"1",
                        "@transfercode":"",
                        "@origin":"ASHB",
                        "@destination":"CIVC",
                        "@origTimeMin":"9:12 AM",
                        "@origTimeDate":"01/02/2018",
                        "@destTimeMin":"9:37 AM",
                        "@destTimeDate":"01/02/2018",
                        "@line":"ROUTE 7",
                        "@bikeflag":"1",
                        "@trainHeadStation":"Millbrae",
                        "@load":"2",
                        "@trainId":"4590857",
                        "@trainIdx":"20"
                     }
                  ]
               },
               {  
                  "@origin":"ASHB",
                  "@destination":"CIVC",
                  "@fare":"4.45",
                  "@origTimeMin":"9:20 AM",
                  "@origTimeDate":"01/02/2018 ",
                  "@destTimeMin":"9:44 AM",
                  "@destTimeDate":"01/02/2018",
                  "@clipper":"1.45",
                  "@tripTime":"24",
                  "fares":{  
                     "@level":"normal",
                     "fare":[  
                        {  
                           "@amount":"3.95",
                           "@class":"clipper",
                           "@name":"Clipper"
                        },
                        {  
                           "@amount":"4.45",
                           "@class":"cash",
                           "@name":"BART Blue Ticket"
                        },
                        {  
                           "@amount":"1.45",
                           "@class":"rtcclipper",
                           "@name":"Senior/Disabled Clipper"
                        },
                        {  
                           "@amount":"1.95",
                           "@class":"student",
                           "@name":"Youth Clipper"
                        }
                     ]
                  },
                  "leg":[  
                     {  
                        "@order":"1",
                        "@transfercode":"S",
                        "@origin":"ASHB",
                        "@destination":"MCAR",
                        "@origTimeMin":"9:20 AM",
                        "@origTimeDate":"01/02/2018",
                        "@destTimeMin":"9:23 AM",
                        "@destTimeDate":"01/02/2018",
                        "@line":"ROUTE 4",
                        "@bikeflag":"1",
                        "@trainHeadStation":"Warm Springs/South Fremont",
                        "@load":"2",
                        "@trainId":"2390905",
                        "@trainIdx":"20"
                     },
                     {  
                        "@order":"2",
                        "@transfercode":"",
                        "@origin":"MCAR",
                        "@destination":"CIVC",
                        "@origTimeMin":"9:23 AM",
                        "@origTimeDate":"01/02/2018",
                        "@destTimeMin":"9:44 AM",
                        "@destTimeDate":"01/02/2018",
                        "@line":"ROUTE 1",
                        "@bikeflag":"1",
                        "@trainHeadStation":"San Francisco International Airport",
                        "@load":"2",
                        "@trainId":"3730847",
                        "@trainIdx":"34"
                     }
                  ]
               },
               {  
                  "@origin":"ASHB",
                  "@destination":"CIVC",
                  "@fare":"4.45",
                  "@origTimeMin":"9:27 AM",
                  "@origTimeDate":"01/02/2018 ",
                  "@destTimeMin":"9:52 AM",
                  "@destTimeDate":"01/02/2018",
                  "@clipper":"1.45",
                  "@tripTime":"25",
                  "fares":{  
                     "@level":"normal",
                     "fare":[  
                        {  
                           "@amount":"3.95",
                           "@class":"clipper",
                           "@name":"Clipper"
                        },
                        {  
                           "@amount":"4.45",
                           "@class":"cash",
                           "@name":"BART Blue Ticket"
                        },
                        {  
                           "@amount":"1.45",
                           "@class":"rtcclipper",
                           "@name":"Senior/Disabled Clipper"
                        },
                        {  
                           "@amount":"1.95",
                           "@class":"student",
                           "@name":"Youth Clipper"
                        }
                     ]
                  },
                  "leg":[  
                     {  
                        "@order":"1",
                        "@transfercode":"",
                        "@origin":"ASHB",
                        "@destination":"CIVC",
                        "@origTimeMin":"9:27 AM",
                        "@origTimeDate":"01/02/2018",
                        "@destTimeMin":"9:52 AM",
                        "@destTimeDate":"01/02/2018",
                        "@line":"ROUTE 7",
                        "@bikeflag":"1",
                        "@trainHeadStation":"Millbrae",
                        "@load":"1",
                        "@trainId":"4610912",
                        "@trainIdx":"21"
                     }
                  ]
               },
               {  
                  "@origin":"ASHB",
                  "@destination":"CIVC",
                  "@fare":"4.45",
                  "@origTimeMin":"9:35 AM",
                  "@origTimeDate":"01/02/2018 ",
                  "@destTimeMin":"9:59 AM",
                  "@destTimeDate":"01/02/2018",
                  "@clipper":"1.45",
                  "@tripTime":"24",
                  "fares":{  
                     "@level":"normal",
                     "fare":[  
                        {  
                           "@amount":"3.95",
                           "@class":"clipper",
                           "@name":"Clipper"
                        },
                        {  
                           "@amount":"4.45",
                           "@class":"cash",
                           "@name":"BART Blue Ticket"
                        },
                        {  
                           "@amount":"1.45",
                           "@class":"rtcclipper",
                           "@name":"Senior/Disabled Clipper"
                        },
                        {  
                           "@amount":"1.95",
                           "@class":"student",
                           "@name":"Youth Clipper"
                        }
                     ]
                  },
                  "leg":[  
                     {  
                        "@order":"1",
                        "@transfercode":"S",
                        "@origin":"ASHB",
                        "@destination":"MCAR",
                        "@origTimeMin":"9:35 AM",
                        "@origTimeDate":"01/02/2018",
                        "@destTimeMin":"9:38 AM",
                        "@destTimeDate":"01/02/2018",
                        "@line":"ROUTE 4",
                        "@bikeflag":"1",
                        "@trainHeadStation":"Warm Springs/South Fremont",
                        "@load":"1",
                        "@trainId":"2210920",
                        "@trainIdx":"21"
                     },
                     {  
                        "@order":"2",
                        "@transfercode":"",
                        "@origin":"MCAR",
                        "@destination":"CIVC",
                        "@origTimeMin":"9:38 AM",
                        "@origTimeDate":"01/02/2018",
                        "@destTimeMin":"9:59 AM",
                        "@destTimeDate":"01/02/2018",
                        "@line":"ROUTE 1",
                        "@bikeflag":"1",
                        "@trainHeadStation":"San Francisco International Airport",
                        "@load":"2",
                        "@trainId":"3750902",
                        "@trainIdx":"35"
                     }
                  ]
               }
            ]
         }
      },
      "message":{  
         "legend":"bikeflag: 1 = bikes allowed. 0 = no bikes allowed. transfercode: blank = no transfer, N = normal transfer, T = timed transfer, connecting trains will wait up to five minutes for transferring passengers. S = scheduled transfer, connecting trains will not wait for transferring passengers if there is a delay."
      }
   }
}"""

    const val depart = """{  
   "?xml":{  
      "@version":"1.0",
      "@encoding":"utf-8"
   },
   "root":{  
      "@id":"1",
      "uri":{  
         "#cdata-section":"http://api.bart.gov/api/sched.aspx?cmd=depart&orig=ASHB&dest=CIVC&date=now&b=2&a=2&l=1&json=y"
      },
      "origin":"ASHB",
      "destination":"CIVC",
      "sched_num":"45",
      "schedule":{  
         "date":"Jan 2, 2018",
         "time":"10:10 AM",
         "before":"2",
         "after":"2",
         "request":{  
            "trip":[  
               {  
                  "@origin":"ASHB",
                  "@destination":"CIVC",
                  "@fare":"4.45",
                  "@origTimeMin":"9:57 AM",
                  "@origTimeDate":"01/02/2018 ",
                  "@destTimeMin":"10:22 AM",
                  "@destTimeDate":"01/02/2018",
                  "@clipper":"1.45",
                  "@tripTime":"25",
                  "fares":{  
                     "@level":"normal",
                     "fare":[  
                        {  
                           "@amount":"3.95",
                           "@class":"clipper",
                           "@name":"Clipper"
                        },
                        {  
                           "@amount":"4.45",
                           "@class":"cash",
                           "@name":"BART Blue Ticket"
                        },
                        {  
                           "@amount":"1.45",
                           "@class":"rtcclipper",
                           "@name":"Senior/Disabled Clipper"
                        },
                        {  
                           "@amount":"1.95",
                           "@class":"student",
                           "@name":"Youth Clipper"
                        }
                     ]
                  },
                  "leg":[  
                     {  
                        "@order":"1",
                        "@transfercode":"",
                        "@origin":"ASHB",
                        "@destination":"CIVC",
                        "@origTimeMin":"9:57 AM",
                        "@origTimeDate":"01/02/2018",
                        "@destTimeMin":"10:22 AM",
                        "@destTimeDate":"01/02/2018",
                        "@line":"ROUTE 7",
                        "@bikeflag":"1",
                        "@trainHeadStation":"Millbrae",
                        "@load":"1",
                        "@trainId":"4430942",
                        "@trainIdx":"23"
                     }
                  ]
               },
               {  
                  "@origin":"ASHB",
                  "@destination":"CIVC",
                  "@fare":"4.45",
                  "@origTimeMin":"10:05 AM",
                  "@origTimeDate":"01/02/2018 ",
                  "@destTimeMin":"10:29 AM",
                  "@destTimeDate":"01/02/2018",
                  "@clipper":"1.45",
                  "@tripTime":"24",
                  "fares":{  
                     "@level":"normal",
                     "fare":[  
                        {  
                           "@amount":"3.95",
                           "@class":"clipper",
                           "@name":"Clipper"
                        },
                        {  
                           "@amount":"4.45",
                           "@class":"cash",
                           "@name":"BART Blue Ticket"
                        },
                        {  
                           "@amount":"1.45",
                           "@class":"rtcclipper",
                           "@name":"Senior/Disabled Clipper"
                        },
                        {  
                           "@amount":"1.95",
                           "@class":"student",
                           "@name":"Youth Clipper"
                        }
                     ]
                  },
                  "leg":[  
                     {  
                        "@order":"1",
                        "@transfercode":"S",
                        "@origin":"ASHB",
                        "@destination":"MCAR",
                        "@origTimeMin":"10:05 AM",
                        "@origTimeDate":"01/02/2018",
                        "@destTimeMin":"10:08 AM",
                        "@destTimeDate":"01/02/2018",
                        "@line":"ROUTE 4",
                        "@bikeflag":"1",
                        "@trainHeadStation":"Warm Springs/South Fremont",
                        "@load":"2",
                        "@trainId":"2250950",
                        "@trainIdx":"23"
                     },
                     {  
                        "@order":"2",
                        "@transfercode":"",
                        "@origin":"MCAR",
                        "@destination":"CIVC",
                        "@origTimeMin":"10:08 AM",
                        "@origTimeDate":"01/02/2018",
                        "@destTimeMin":"10:29 AM",
                        "@destTimeDate":"01/02/2018",
                        "@line":"ROUTE 1",
                        "@bikeflag":"1",
                        "@trainHeadStation":"San Francisco International Airport",
                        "@load":"2",
                        "@trainId":"3790932",
                        "@trainIdx":"37"
                     }
                  ]
               },
               {  
                  "@origin":"ASHB",
                  "@destination":"CIVC",
                  "@fare":"4.45",
                  "@origTimeMin":"10:12 AM",
                  "@origTimeDate":"01/02/2018 ",
                  "@destTimeMin":"10:37 AM",
                  "@destTimeDate":"01/02/2018",
                  "@clipper":"1.45",
                  "@tripTime":"25",
                  "fares":{  
                     "@level":"normal",
                     "fare":[  
                        {  
                           "@amount":"3.95",
                           "@class":"clipper",
                           "@name":"Clipper"
                        },
                        {  
                           "@amount":"4.45",
                           "@class":"cash",
                           "@name":"BART Blue Ticket"
                        },
                        {  
                           "@amount":"1.45",
                           "@class":"rtcclipper",
                           "@name":"Senior/Disabled Clipper"
                        },
                        {  
                           "@amount":"1.95",
                           "@class":"student",
                           "@name":"Youth Clipper"
                        }
                     ]
                  },
                  "leg":[  
                     {  
                        "@order":"1",
                        "@transfercode":"",
                        "@origin":"ASHB",
                        "@destination":"CIVC",
                        "@origTimeMin":"10:12 AM",
                        "@origTimeDate":"01/02/2018",
                        "@destTimeMin":"10:37 AM",
                        "@destTimeDate":"01/02/2018",
                        "@line":"ROUTE 7",
                        "@bikeflag":"1",
                        "@trainHeadStation":"Millbrae",
                        "@load":"1",
                        "@trainId":"4450957",
                        "@trainIdx":"24"
                     }
                  ]
               },
               {  
                  "@origin":"ASHB",
                  "@destination":"CIVC",
                  "@fare":"4.45",
                  "@origTimeMin":"10:20 AM",
                  "@origTimeDate":"01/02/2018 ",
                  "@destTimeMin":"10:44 AM",
                  "@destTimeDate":"01/02/2018",
                  "@clipper":"1.45",
                  "@tripTime":"24",
                  "fares":{  
                     "@level":"normal",
                     "fare":[  
                        {  
                           "@amount":"3.95",
                           "@class":"clipper",
                           "@name":"Clipper"
                        },
                        {  
                           "@amount":"4.45",
                           "@class":"cash",
                           "@name":"BART Blue Ticket"
                        },
                        {  
                           "@amount":"1.45",
                           "@class":"rtcclipper",
                           "@name":"Senior/Disabled Clipper"
                        },
                        {  
                           "@amount":"1.95",
                           "@class":"student",
                           "@name":"Youth Clipper"
                        }
                     ]
                  },
                  "leg":[  
                     {  
                        "@order":"1",
                        "@transfercode":"S",
                        "@origin":"ASHB",
                        "@destination":"MCAR",
                        "@origTimeMin":"10:20 AM",
                        "@origTimeDate":"01/02/2018",
                        "@destTimeMin":"10:23 AM",
                        "@destTimeDate":"01/02/2018",
                        "@line":"ROUTE 4",
                        "@bikeflag":"1",
                        "@trainHeadStation":"Warm Springs/South Fremont",
                        "@load":"2",
                        "@trainId":"2271005",
                        "@trainIdx":"24"
                     },
                     {  
                        "@order":"2",
                        "@transfercode":"",
                        "@origin":"MCAR",
                        "@destination":"CIVC",
                        "@origTimeMin":"10:23 AM",
                        "@origTimeDate":"01/02/2018",
                        "@destTimeMin":"10:44 AM",
                        "@destTimeDate":"01/02/2018",
                        "@line":"ROUTE 1",
                        "@bikeflag":"1",
                        "@trainHeadStation":"San Francisco International Airport",
                        "@load":"2",
                        "@trainId":"3810947",
                        "@trainIdx":"38"
                     }
                  ]
               }
            ]
         }
      },
      "message":{  
         "legend":"bikeflag: 1 = bikes allowed. 0 = no bikes allowed. transfercode: blank = no transfer, N = normal transfer, T = timed transfer, connecting trains will wait up to five minutes for transferring passengers. S = scheduled transfer, connecting trains will not wait for transferring passengers if there is a delay."
      }
   }
}"""

    const val fare = """{  
   "?xml":{  
      "@version":"1.0",
      "@encoding":"utf-8"
   },
   "root":{  
      "uri":{  
         "#cdata-section":"http://api.bart.gov/api/sched.aspx?cmd=fare&orig=12th&dest=embr&date=today&json=y"
      },
      "origin":"12TH",
      "destination":"EMBR",
      "sched_num":"45",
      "trip":{  
         "fare":"4.00",
         "discount":{  
            "clipper":"1.30"
         }
      },
      "fares":{  
         "@level":"normal",
         "fare":[  
            {  
               "@amount":"3.50",
               "@class":"clipper",
               "@name":"Clipper"
            },
            {  
               "@amount":"4.00",
               "@class":"cash",
               "@name":"BART Blue Ticket"
            },
            {  
               "@amount":"1.30",
               "@class":"rtcclipper",
               "@name":"Senior/Disabled Clipper"
            },
            {  
               "@amount":"1.75",
               "@class":"student",
               "@name":"Youth Clipper"
            }
         ]
      },
      "message":{  
         "co2_emissions":{  
            "#cdata-section":"
CO2 emissions saved by this BART trip: 7.7 pounds. Read more

"
         }
      }
   }
}"""

    const val help = """{
   "?xml":{
      "@version":"1.0",
      "@encoding":"utf-8"
   },
   "root":{
      "uri":{
         "#cdata-section":"http://api.bart.gov/api/sched.aspx?cmd=help&json=y"
      },
      "message":{
         "help":{
            "#cdata-section":"Commands: arrive, depart, fare, help, holiday, routesched, scheds, special, stnsched "
         }
      }
   }
}"""

    const val holiday = """{
   "?xml":{
      "@version":"1.0",
      "@encoding":"utf-8"
   },
   "root":{
      "@id":"1",
      "uri":{
         "#cdata-section":"http://api.bart.gov/api/sched.aspx?cmd=holiday&json=y"
      },
      "holidays":[
         {
            "holiday":[
               {
                  "name":"Thanksgiving Day",
                  "date":"11/24/2016",
                  "schedule_type":"Sunday"
               },
               {
                  "name":"Christmas Day",
                  "date":"12/25/2016",
                  "schedule_type":"Sunday"
               },
               {
                  "name":"New Year's Day",
                  "date":"01/01/2017",
                  "schedule_type":"Sunday"
               },
               {
                  "name":"Martin Luther King, Jr. Day",
                  "date":"01/16/2017",
                  "schedule_type":"Saturday"
               },
               {
                  "name":"Presidents' Day",
                  "date":"02/20/2017",
                  "schedule_type":"Saturday"
               },
               {
                  "name":"Memorial Day",
                  "date":"05/29/2017",
                  "schedule_type":"Sunday"
               },
               {
                  "name":"Independence Day",
                  "date":"07/04/2017",
                  "schedule_type":"Sunday"
               },
               {
                  "name":"Labor Day",
                  "date":"09/04/2017",
                  "schedule_type":"Sunday"
               },
               {
                  "name":"Thanksgiving Day",
                  "date":"11/23/2017",
                  "schedule_type":"Sunday"
               },
               {
                  "name":"Christmas Day",
                  "date":"12/25/2017",
                  "schedule_type":"Sunday"
               },
               {
                  "name":"New Year's Day",
                  "date":"01/01/2018",
                  "schedule_type":"Sunday"
               }
            ]
         }
      ],
      "message":""
   }
}"""

    const val routeSched = """{
   "?xml":{
      "@version":"1.0",
      "@encoding":"utf-8"
   },
   "root":{
      "uri":{
         "#cdata-section":"http://api.bart.gov/api/sched.aspx?cmd=routesched&route=6&time=12:47+am&json=y"
      },
      "date":"6/27/2017",
      "sched_num":"43",
      "route":{
         "train":[
            {
               "@trainId":"1090441",
               "@trainIdx":"1",
               "@index":"1",
               "stop":[
                  {
                     "@station":"DALY",
                     "@load":"",
                     "@level":"",
                     "@bikeflag":"1"
                  },
                  {
                     "@station":"BALB",
                     "@load":"",
                     "@level":"",
                     "@bikeflag":"1"
                  },
                  {
                     "@station":"GLEN",
                     "@load":"",
                     "@level":"",
                     "@bikeflag":"1"
                  },
                  {
                     "@station":"24TH",
                     "@load":"",
                     "@level":"",
                     "@bikeflag":"1"
                  },
                  {
                     "@station":"16TH",
                     "@load":"",
                     "@level":"",
                     "@bikeflag":"1"
                  },
                  {
                     "@station":"CIVC",
                     "@load":"",
                     "@level":"",
                     "@bikeflag":"1"
                  },
                  {
                     "@station":"POWL",
                     "@load":"",
                     "@level":"",
                     "@bikeflag":"1"
                  },
                  {
                     "@station":"MONT",
                     "@load":"",
                     "@level":"",
                     "@bikeflag":"1"
                  },
                  {
                     "@station":"EMBR",
                     "@load":"",
                     "@level":"",
                     "@bikeflag":"1"
                  },
                  {
                     "@station":"WOAK",
                     "@load":"",
                     "@level":"",
                     "@bikeflag":"1"
                  },
                  {
                     "@station":"LAKE",
                     "@load":"",
                     "@level":"",
                     "@bikeflag":"1"
                  },
                  {
                     "@station":"FTVL",
                     "@load":"",
                     "@level":"",
                     "@bikeflag":"1"
                  },
                  {
                     "@station":"COLS",
                     "@load":"",
                     "@level":"",
                     "@bikeflag":"1"
                  },
                  {
                     "@station":"SANL",
                     "@load":"",
                     "@level":"",
                     "@bikeflag":"1"
                  },
                  {
                     "@station":"BAYF",
                     "@load":"",
                     "@level":"",
                     "@bikeflag":"1"
                  },
                  {
                     "@station":"HAYW",
                     "@load":"",
                     "@level":"",
                     "@bikeflag":"1"
                  },
                  {
                     "@station":"SHAY",
                     "@load":"",
                     "@level":"",
                     "@bikeflag":"1"
                  },
                  {
                     "@station":"UCTY",
                     "@load":"1",
                     "@level":"normal",
                     "@origTime":"4:41 AM",
                     "@bikeflag":"1"
                  },
                  {
                     "@station":"FRMT",
                     "@load":"1",
                     "@level":"normal",
                     "@origTime":"4:46 AM",
                     "@bikeflag":"1"
                  },
                  {
                     "@station":"WARM",
                     "@load":"1",
                     "@level":"normal",
                     "@origTime":"4:53 AM",
                     "@bikeflag":"1"
                  }
               ]
            },
            {
               "@trainId":"1111856",
               "@trainIdx":"62",
               "@index":"62",
               "stop":[
                  {
                     "@station":"DALY",
                     "@load":"1",
                     "@level":"normal",
                     "@origTime":"6:56 PM",
                     "@bikeflag":"1"
                  },
                  {
                     "@station":"BALB",
                     "@load":"1",
                     "@level":"normal",
                     "@origTime":"7:00 PM",
                     "@bikeflag":"1"
                  },
                  {
                     "@station":"GLEN",
                     "@load":"1",
                     "@level":"normal",
                     "@origTime":"7:02 PM",
                     "@bikeflag":"1"
                  },
                  {
                     "@station":"24TH",
                     "@load":"1",
                     "@level":"normal",
                     "@origTime":"7:05 PM",
                     "@bikeflag":"1"
                  },
                  {
                     "@station":"16TH",
                     "@load":"1",
                     "@level":"normal",
                     "@origTime":"7:07 PM",
                     "@bikeflag":"1"
                  },
                  {
                     "@station":"CIVC",
                     "@load":"1",
                     "@level":"normal",
                     "@origTime":"7:09 PM",
                     "@bikeflag":"1"
                  },
                  {
                     "@station":"POWL",
                     "@load":"1",
                     "@level":"normal",
                     "@origTime":"7:11 PM",
                     "@bikeflag":"1"
                  },
                  {
                     "@station":"MONT",
                     "@load":"1",
                     "@level":"normal",
                     "@origTime":"7:12 PM",
                     "@bikeflag":"1"
                  },
                  {
                     "@station":"EMBR",
                     "@load":"2",
                     "@level":"normal",
                     "@origTime":"7:14 PM",
                     "@bikeflag":"1"
                  },
                  {
                     "@station":"WOAK",
                     "@load":"2",
                     "@level":"normal",
                     "@origTime":"7:21 PM",
                     "@bikeflag":"1"
                  },
                  {
                     "@station":"LAKE",
                     "@load":"2",
                     "@level":"normal",
                     "@origTime":"7:26 PM",
                     "@bikeflag":"1"
                  },
                  {
                     "@station":"FTVL",
                     "@load":"1",
                     "@level":"normal",
                     "@origTime":"7:30 PM",
                     "@bikeflag":"1"
                  },
                  {
                     "@station":"COLS",
                     "@load":"1",
                     "@level":"normal",
                     "@origTime":"7:33 PM",
                     "@bikeflag":"1"
                  },
                  {
                     "@station":"SANL",
                     "@load":"1",
                     "@level":"normal",
                     "@origTime":"7:37 PM",
                     "@bikeflag":"1"
                  },
                  {
                     "@station":"BAYF",
                     "@load":"1",
                     "@level":"normal",
                     "@origTime":"7:41 PM",
                     "@bikeflag":"1"
                  },
                  {
                     "@station":"HAYW",
                     "@load":"1",
                     "@level":"normal",
                     "@origTime":"7:45 PM",
                     "@bikeflag":"1"
                  },
                  {
                     "@station":"SHAY",
                     "@load":"1",
                     "@level":"normal",
                     "@origTime":"7:48 PM",
                     "@bikeflag":"1"
                  },
                  {
                     "@station":"UCTY",
                     "@load":"1",
                     "@level":"normal",
                     "@origTime":"7:53 PM",
                     "@bikeflag":"1"
                  },
                  {
                     "@station":"FRMT",
                     "@load":"1",
                     "@level":"normal",
                     "@origTime":"7:58 PM",
                     "@bikeflag":"1"
                  },
                  {
                     "@station":"WARM",
                     "@load":"1",
                     "@level":"normal",
                     "@origTime":"8:05 PM",
                     "@bikeflag":"1"
                  }
               ]
            }
         ]
      },
      "message":{
         "warning":"The time specified is within the previous schedule day. For details see http://api.bart.gov/docs/overview/barttime.aspx",
         "special_schedule":{
            "#cdata-section":"Some Pleasant Hill parking garage elevators will be out of service through 2017. <a href=\"http://www.bart.gov/news/articles/2016/news20161130\">Read more...</a>"
         }
      }
   }
}"""

    const val scheds = """{
   "?xml":{
      "@version":"1.0",
      "@encoding":"utf-8"
   },
   "root":{
      "uri":{
         "#cdata-section":"http://api.bart.gov/api/sched.aspx?cmd=scheds&json=y"
      },
      "schedules":{
         "schedule":[
            {
               "@id":"41",
               "@effectivedate":"03/28/2016"
            },
            {
               "@id":"42",
               "@effectivedate":"03/25/2017"
            },
            {
               "@id":"43",
               "@effectivedate":"06/12/2017"
            }
         ]
      },
      "message":""
   }
}"""

    const val special = """{
   "?xml":{
      "@version":"1.0",
      "@encoding":"utf-8"
   },
   "root":{
      "uri":{
         "#cdata-section":"http://api.bart.gov/api/sched.aspx?cmd=special&l=1&json=y"
      },
      "special_schedules":{
         "special_schedule":[
            {
               "start_date":"07/01/2017",
               "end_date":"07/02/2017",
               "start_time":"",
               "end_time":"",
               "text":{
                  "#cdata-section":"Expect delays of 20 to 40 minutes because of bus bridge between Fruitvale & 19th St."
               },
               "link":{
                  "#cdata-section":"http://www.bart.gov/news/articles/2017/news20170302-1"
               },
               "orig":"",
               "dest":"",
               "day_of_week":"",
               "routes_affected":"ROUTE 3, ROUTE 4, ROUTE 5, ROUTE 6, ROUTE 11, ROUTE 12, ROUTE 19, ROUTE 20"
            },
            {
               "start_date":"07/02/2017",
               "end_date":"07/02/2017",
               "start_time":"",
               "end_time":"",
               "text":{
                  "#cdata-section":"Single-tracking between Balboa Park & Daly City Sunday 7/2"
               },
               "link":{
                  "#cdata-section":"http://www.bart.gov/news/articles/2017/news20170623"
               },
               "orig":"",
               "dest":"",
               "day_of_week":"",
               "routes_affected":"ROUTE 1, ROUTE 2, ROUTE 5, ROUTE 6, ROUTE 7, ROUTE 8, ROUTE 11, ROUTE 12"
            },
            {
               "start_date":"11/30/2016",
               "end_date":"09/29/2017",
               "start_time":"",
               "end_time":"",
               "text":{
                  "#cdata-section":"Some Pleasant Hill parking garage elevators will be out of service through 2017."
               },
               "link":{
                  "#cdata-section":"http://www.bart.gov/news/articles/2016/news20161130"
               },
               "orig":"",
               "dest":"",
               "day_of_week":"",
               "routes_affected":""
            }
         ]
      },
      "message":{
         "legend":"day_of_week: 0 = Sunday, 1 = Monday, 2 = Tuesday, 3 = Wednesday, 4 = Thursday, 5 = Friday, 6 = Saturday, blank = all days"
      }
   }
}"""

    const val stnsched = """{
   "?xml":{
      "@version":"1.0",
      "@encoding":"utf-8"
   },
   "root":{
      "uri":{
         "#cdata-section":"http://api.bart.gov/api/sched.aspx?cmd=stnsched&orig=12th&l=1&json=y"
      },
      "date":"6/27/2017",
      "sched_num":"43",
      "station":{
         "name":"12th St. Oakland City Center",
         "abbr":"12TH",
         "item":[
            {
               "@line":"ROUTE 7",
               "@trainHeadStation":"MLBR",
               "@origTime":"4:36 AM",
               "@destTime":"5:20 AM",
               "@trainIdx":"1",
               "@bikeflag":"1",
               "@trainId":"4430412",
               "@load":"1"
            },
            {
               "@line":"ROUTE 2",
               "@trainHeadStation":"PITT",
               "@origTime":"4:37 AM",
               "@destTime":"5:17 AM",
               "@trainIdx":"1",
               "@bikeflag":"1",
               "@trainId":"3730409",
               "@load":"1"
            },
            {
               "@line":"ROUTE 3",
               "@trainHeadStation":"RICH",
               "@origTime":"4:37 AM",
               "@destTime":"5:01 AM",
               "@trainIdx":"1",
               "@bikeflag":"1",
               "@trainId":"2290400",
               "@load":"1"
            },
            {
               "@line":"ROUTE 1",
               "@trainHeadStation":"SFIA",
               "@origTime":"4:43 AM",
               "@destTime":"5:27 AM",
               "@trainIdx":"1",
               "@bikeflag":"1",
               "@trainId":"3610402",
               "@load":"1"
            },
            {
               "@line":"ROUTE 4",
               "@trainHeadStation":"FRMT",
               "@origTime":"4:45 AM",
               "@destTime":"5:20 AM",
               "@trainIdx":"1",
               "@bikeflag":"1",
               "@trainId":"2210420",
               "@load":"1"
            },
            {
               "@line":"ROUTE 7",
               "@trainHeadStation":"MLBR",
               "@origTime":"4:51 AM",
               "@destTime":"5:35 AM",
               "@trainIdx":"2",
               "@bikeflag":"1",
               "@trainId":"4450427",
               "@load":"1"
            },
            {
               "@line":"ROUTE 2",
               "@trainHeadStation":"PITT",
               "@origTime":"4:52 AM",
               "@destTime":"5:32 AM",
               "@trainIdx":"2",
               "@bikeflag":"1",
               "@trainId":"3750351",
               "@load":"1"
            },
            {
               "@line":"ROUTE 3",
               "@trainHeadStation":"RICH",
               "@origTime":"4:52 AM",
               "@destTime":"5:16 AM",
               "@trainIdx":"2",
               "@bikeflag":"1",
               "@trainId":"2310415",
               "@load":"1"
            },
            {
               "@line":"ROUTE 1",
               "@trainHeadStation":"SFIA",
               "@origTime":"4:58 AM",
               "@destTime":"5:42 AM",
               "@trainIdx":"2",
               "@bikeflag":"1",
               "@trainId":"3630417",
               "@load":"1"
            },
            {
               "@line":"ROUTE 4",
               "@trainHeadStation":"FRMT",
               "@origTime":"5:00 AM",
               "@destTime":"5:35 AM",
               "@trainIdx":"2",
               "@bikeflag":"1",
               "@trainId":"2230435",
               "@load":"1"
            },
            {
               "@line":"ROUTE 3",
               "@trainHeadStation":"RICH",
               "@origTime":"12:16 AM",
               "@destTime":"12:41 AM",
               "@trainIdx":"75",
               "@bikeflag":"1",
               "@trainId":"2232333",
               "@load":"1"
            },
            {
               "@line":"ROUTE 1",
               "@trainHeadStation":"MLBR",
               "@origTime":"12:20 AM",
               "@destTime":"1:11 AM",
               "@trainIdx":"95",
               "@bikeflag":"1",
               "@trainId":"3612337",
               "@load":"1"
            },
            {
               "@line":"ROUTE 4",
               "@trainHeadStation":"WARM",
               "@origTime":"12:22 AM",
               "@destTime":"1:04 AM",
               "@trainIdx":"75",
               "@bikeflag":"1",
               "@trainId":"2372355",
               "@load":"1"
            },
            {
               "@line":"ROUTE 3",
               "@trainHeadStation":"RICH",
               "@origTime":"12:36 AM",
               "@destTime":"1:04 AM",
               "@trainIdx":"76",
               "@bikeflag":"1",
               "@trainId":"2252353",
               "@load":"1"
            },
            {
               "@line":"ROUTE 2",
               "@trainHeadStation":"PITT",
               "@origTime":"12:37 AM",
               "@destTime":"1:20 AM",
               "@trainIdx":"96",
               "@bikeflag":"1",
               "@trainId":"3772349",
               "@load":"1"
            },
            {
               "@line":"ROUTE 1",
               "@trainHeadStation":"SFIA",
               "@origTime":"12:51 AM",
               "@destTime":"1:34 AM",
               "@trainIdx":"96",
               "@bikeflag":"1",
               "@trainId":"3632359",
               "@load":"1"
            },
            {
               "@line":"ROUTE 4",
               "@trainHeadStation":"WARM",
               "@origTime":"12:53 AM",
               "@destTime":"1:34 AM",
               "@trainIdx":"76",
               "@bikeflag":"1",
               "@trainId":"2390017",
               "@load":"1"
            }
         ]
      },
      "message":{
         "legend":"bikeflag = 1, bikes allowed. bikeflag = 0, no bikes allowed."
      }
   }
}"""

    val commandMap = mapOf(
        "arrive" to arrive,
        "depart" to depart,
        "fare" to fare,
        "help" to help,
        "holiday" to holiday,
        "routesched" to routeSched,
        "scheds" to scheds,
        "special" to special,
        "stnsched" to stnsched
    )
}