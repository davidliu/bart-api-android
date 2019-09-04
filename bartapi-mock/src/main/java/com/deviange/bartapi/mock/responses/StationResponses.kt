package com.deviange.bartapi.mock.responses

object StationResponses {
    const val help = """{
   "?xml":{
      "@version":"1.0",
      "@encoding":"utf-8"
   },
   "root":{
      "uri":{
         "#cdata-section":"http://api.bart.gov/api/stn.aspx?cmd=help&json=y"
      },
      "message":{
         "help":{
            "#cdata-section":"Commands: help, stninfo, stnaccess, stns "
         }
      }
   }
}"""

    const val stninfo = """{
"?xml": {
"@version": "1.0",
"@encoding": "utf-8"
},
"root": {
"@id": "1",
"uri": {
"#cdata-section": "http://api.bart.gov/api/stn.aspx?cmd=stninfo&orig=24th&json=y"
},
"stations": {
"station": {
"name": "24th St. Mission",
"abbr": "24TH",
"gtfs_latitude": "37.752470",
"gtfs_longitude": "-122.418143",
"address": "2800 Mission Street",
"city": "San Francisco",
"county": "sanfrancisco",
"state": "CA",
"zipcode": "94110",
"north_routes": {
"route": [
"ROUTE 2",
"ROUTE 6",
"ROUTE 8",
"ROUTE 12"
]
},
"south_routes": {
"route": [
"ROUTE 1",
"ROUTE 5",
"ROUTE 7",
"ROUTE 11"
]
},
"north_platforms": {
"platform": [
"2"
]
},
"south_platforms": {
"platform": [
"1"
]
},
"platform_info": "Always check destination signs and listen for departure announcements.",
"intro": {
"#cdata-section": "\"The Mission\" refers to the San Francisco de Asis Mission, also known as Mission Dolores, which was founded 1776. Today the neighborhood is host to an eclectic mix of restaurants, markets, performance spaces, shops, and nightspots."
},
"cross_street": {
"#cdata-section": "Nearby Cross: 24th St."
},
"food": {
"#cdata-section": "Nearby restaurant reviews from <a href=\"http://www.yelp.com/search?find_desc=Restaurant+&ns=1&rpp=10&find_loc=2800 Mission Street San Francisco, CA 94110\">yelp.com</a>"
},
"shopping": {
"#cdata-section": "Local shopping from <a href=\"http://www.yelp.com/search?find_desc=Shopping+&ns=1&rpp=10&find_loc=2800 Mission Street San Francisco, CA 94110\">yelp.com</a>"
},
"attraction": {
"#cdata-section": "More station area attractions from <a href=\"http://www.yelp.com/search?find_desc=+&ns=1&rpp=10&find_loc=2800 Mission Street San Francisco, CA 94110\">yelp.com</a>"
},
"link": {
"#cdata-section": "http://www.bart.gov/stations/24TH"
}
}
},
"message": ""
}
}"""

    const val stnaccess = """{
   "?xml":{
      "@version":"1.0",
      "@encoding":"utf-8"
   },
   "root":{
      "uri":{
         "#cdata-section":"http://api.bart.gov/api/stn.aspx?cmd=stnaccess&orig=12th&l=1&json=y"
      },
      "stations":{
         "station":{
            "@parking_flag":"0",
            "@bike_flag":"0",
            "@bike_station_flag":"0",
            "@locker_flag":"1",
            "name":"12th St. Oakland City Center",
            "abbr":"12TH",
            "entering":{
               "#cdata-section":"<p>The BART trains at 12th St. Oakland City Center Station are located two and three levels below the street. The first level below ground is the concourse level. The second level is the upper platform level and the third level is the lower platform level.</p>\n<p>Two separate elevators (referred to as Street and Platform) are needed to get from the street to the train platforms.</p>\n<p>The street access to the elevator is located on Broadway between 11th Street and 12th Street.</p>\n<p>From the street, the Street elevator will take you to the concourse level where the station agent and paid area are located. The Street elevator buttons are labeled \"C\" for Concourse and \"S\" for Street.</p>\n<p>When you arrive at the concourse level you will need to travel approximately 60 feet to reach the Platform elevator. The Platform elevator buttons are labeled \"C\" for Concourse, \"UL\" for upper platform, and \"LL\" for lower platform.</p>\n<p>Depending on your destination, the Platform elevator will take you to the upper platform or the lower platform. When the elevator arrives at either platform you will be at the far end of the platforms. Go straight to reach the center of the train boarding area.</p>"
            },
            "exiting":{
               "#cdata-section":"<p>The BART trains at 12th St. Oakland City Center Station are located two and three levels below the street.</p>\n<p>Two separate elevators (referred to as Platform and Street) are needed to get from the train platforms to the street.</p>\n<p>Prior to 8:45 AM weekdays Fremont and San Francisco – Daly City- bound trains arrive at both the upper platform and lower platform. After 8:45 AM on weekdays Fremont and San Francisco – Daly City bound trains arrive at the lower platform only. When departing a Fremont or San Francisco - Daly City train, the elevator will be towards the front of the train at the far end of the platform. The elevator buttons are labeled \"C\" for concourse, \"UL\" for upper platform, and \"LL\" for lower platform.</p>\n<p>When departing a Richmond or Pittsburg – Bay Point train you will be on the upper platform two levels below the street. When exiting the trains the elevator will be towards the rear of the train at the far end of the platform. The elevator buttons are labeled \"C\" for concourse, \"UL\" for upper platform, and \"LL\" for lower platform.</p>"
            },
            "parking":{
               "#cdata-section":"<p>There's no parking at 12th St. Oakland City Center Station. The closest station with parking is <a href=\"http://www.bart.gov/stations/LAKE/\">Lake Merritt</a>.</p>"
            },
            "fill_time":{
               "#cdata-section":""
            },
            "car_share":{
               "#cdata-section":""
            },
            "lockers":{
               "#cdata-section":"<p>Eight (8) electronic bicycle lockers managed by City of Oakland. For more information on these lockers, contact the City of Oakland at <a href=\"http://www.bart.gov/stations/12TH/mailto:bikeped@oaklandnet.com\">bikeped@oaklandnet.com</a> or (510) 238-3983.</p>"
            },
            "bike_station_text":{
               "#cdata-section":""
            },
            "destinations":{
               "#cdata-section":"<p>To find a destination near 12th St. Oakland City Center Station, visit the <a href=\"http://www.bart.gov/stations/12th/neighborhood\">neighborhood section</a>.</p> "
            },
            "transit_info":{
               "#cdata-section":"<p>12th St. Oakland City Center Station is served by <a href=\"http://www.actransit.org\" rel=\"external\">AC Transit</a>. The <a href=\"http://www.greyhound.com\" rel=\"external\" target=\"_blank\">Greyhound</a> bus terminal is located three blocks down 20th Street at San Pablo Avenue.</p>\n<p><strong>Try BART's free trip planning service!</strong><br />For a personalized trip plan with BART and connecting transit, call the BART <a href=\"http://www.bart.gov/siteinfo/contact\">Transit Information Center</a>. It's fast, it's easy, and it's tailored just for you!</p>"
            },
            "link":"http://www.bart.gov/stations/12TH"
         }
      },
      "message":{
         "legend":"parking_flag: 0 = No BART parking, 1 = Yes, parking available. bike_flag: 0 = No bike racks, 1 = Yes, bike racks available. bike_station_flag: 0 = Not a bike station, 1 = Yes, station is a bike station. locker_flag: 0 = No lockers, 1 = Yes, station has lockers."
      }
   }
}"""

    const val stns = """{
"?xml": {
"@version": "1.0",
"@encoding": "utf-8"
},
"root": {
"uri": {
"#cdata-section": "http://api.bart.gov/api/stn.aspx?cmd=stns&json=y"
},
"stations": {
"station": [
{
"name": "12th St. Oakland City Center",
"abbr": "12TH",
"gtfs_latitude": "37.803768",
"gtfs_longitude": "-122.271450",
"address": "1245 Broadway",
"city": "Oakland",
"county": "alameda",
"state": "CA",
"zipcode": "94612"
},
{
"name": "16th St. Mission",
"abbr": "16TH",
"gtfs_latitude": "37.765062",
"gtfs_longitude": "-122.419694",
"address": "2000 Mission Street",
"city": "San Francisco",
"county": "sanfrancisco",
"state": "CA",
"zipcode": "94110"
},
{
"name": "19th St. Oakland",
"abbr": "19TH",
"gtfs_latitude": "37.808350",
"gtfs_longitude": "-122.268602",
"address": "1900 Broadway",
"city": "Oakland",
"county": "alameda",
"state": "CA",
"zipcode": "94612"
},
{
"name": "24th St. Mission",
"abbr": "24TH",
"gtfs_latitude": "37.752470",
"gtfs_longitude": "-122.418143",
"address": "2800 Mission Street",
"city": "San Francisco",
"county": "sanfrancisco",
"state": "CA",
"zipcode": "94110"
},
{
"name": "Antioch",
"abbr": "ANTC",
"gtfs_latitude": "37.995388",
"gtfs_longitude": "-121.780420",
"address": "1600 Slatten Ranch Road",
"city": "Antioch",
"county": "Contra Costa",
"state": "CA",
"zipcode": "94509"
},
{
"name": "Ashby",
"abbr": "ASHB",
"gtfs_latitude": "37.852803",
"gtfs_longitude": "-122.270062",
"address": "3100 Adeline Street",
"city": "Berkeley",
"county": "alameda",
"state": "CA",
"zipcode": "94703"
},
{
"name": "Balboa Park",
"abbr": "BALB",
"gtfs_latitude": "37.721585",
"gtfs_longitude": "-122.447506",
"address": "401 Geneva Avenue",
"city": "San Francisco",
"county": "sanfrancisco",
"state": "CA",
"zipcode": "94112"
},
{
"name": "Bay Fair",
"abbr": "BAYF",
"gtfs_latitude": "37.696924",
"gtfs_longitude": "-122.126514",
"address": "15242 Hesperian Blvd.",
"city": "San Leandro",
"county": "alameda",
"state": "CA",
"zipcode": "94578"
},
{
"name": "Castro Valley",
"abbr": "CAST",
"gtfs_latitude": "37.690746",
"gtfs_longitude": "-122.075602",
"address": "3301 Norbridge Dr.",
"city": "Castro Valley",
"county": "alameda",
"state": "CA",
"zipcode": "94546"
},
{
"name": "Civic Center/UN Plaza",
"abbr": "CIVC",
"gtfs_latitude": "37.779732",
"gtfs_longitude": "-122.414123",
"address": "1150 Market Street",
"city": "San Francisco",
"county": "sanfrancisco",
"state": "CA",
"zipcode": "94102"
},
{
"name": "Coliseum",
"abbr": "COLS",
"gtfs_latitude": "37.753661",
"gtfs_longitude": "-122.196869",
"address": "7200 San Leandro St.",
"city": "Oakland",
"county": "alameda",
"state": "CA",
"zipcode": "94621"
},
{
"name": "Colma",
"abbr": "COLM",
"gtfs_latitude": "37.684638",
"gtfs_longitude": "-122.466233",
"address": "365 D Street",
"city": "Colma",
"county": "sanmateo",
"state": "CA",
"zipcode": "94014"
},
{
"name": "Concord",
"abbr": "CONC",
"gtfs_latitude": "37.973737",
"gtfs_longitude": "-122.029095",
"address": "1451 Oakland Avenue",
"city": "Concord",
"county": "contracosta",
"state": "CA",
"zipcode": "94520"
},
{
"name": "Daly City",
"abbr": "DALY",
"gtfs_latitude": "37.706121",
"gtfs_longitude": "-122.469081",
"address": "500 John Daly Blvd.",
"city": "Daly City",
"county": "sanmateo",
"state": "CA",
"zipcode": "94014"
},
{
"name": "Downtown Berkeley",
"abbr": "DBRK",
"gtfs_latitude": "37.870104",
"gtfs_longitude": "-122.268133",
"address": "2160 Shattuck Avenue",
"city": "Berkeley",
"county": "alameda",
"state": "CA",
"zipcode": "94704"
},
{
"name": "Dublin/Pleasanton",
"abbr": "DUBL",
"gtfs_latitude": "37.701687",
"gtfs_longitude": "-121.899179",
"address": "5801 Owens Dr.",
"city": "Pleasanton",
"county": "alameda",
"state": "CA",
"zipcode": "94588"
},
{
"name": "El Cerrito del Norte",
"abbr": "DELN",
"gtfs_latitude": "37.925086",
"gtfs_longitude": "-122.316794",
"address": "6400 Cutting Blvd.",
"city": "El Cerrito",
"county": "contracosta",
"state": "CA",
"zipcode": "94530"
},
{
"name": "El Cerrito Plaza",
"abbr": "PLZA",
"gtfs_latitude": "37.902632",
"gtfs_longitude": "-122.298904",
"address": "6699 Fairmount Avenue",
"city": "El Cerrito",
"county": "contracosta",
"state": "CA",
"zipcode": "94530"
},
{
"name": "Embarcadero",
"abbr": "EMBR",
"gtfs_latitude": "37.792874",
"gtfs_longitude": "-122.397020",
"address": "298 Market Street",
"city": "San Francisco",
"county": "sanfrancisco",
"state": "CA",
"zipcode": "94111"
},
{
"name": "Fremont",
"abbr": "FRMT",
"gtfs_latitude": "37.557465",
"gtfs_longitude": "-121.976608",
"address": "2000 BART Way",
"city": "Fremont",
"county": "alameda",
"state": "CA",
"zipcode": "94536"
},
{
"name": "Fruitvale",
"abbr": "FTVL",
"gtfs_latitude": "37.774836",
"gtfs_longitude": "-122.224175",
"address": "3401 East 12th Street",
"city": "Oakland",
"county": "alameda",
"state": "CA",
"zipcode": "94601"
},
{
"name": "Glen Park",
"abbr": "GLEN",
"gtfs_latitude": "37.733064",
"gtfs_longitude": "-122.433817",
"address": "2901 Diamond Street",
"city": "San Francisco",
"county": "sanfrancisco",
"state": "CA",
"zipcode": "94131"
},
{
"name": "Hayward",
"abbr": "HAYW",
"gtfs_latitude": "37.669723",
"gtfs_longitude": "-122.087018",
"address": "699 'B' Street",
"city": "Hayward",
"county": "alameda",
"state": "CA",
"zipcode": "94541"
},
{
"name": "Lafayette",
"abbr": "LAFY",
"gtfs_latitude": "37.893176",
"gtfs_longitude": "-122.124630",
"address": "3601 Deer Hill Road",
"city": "Lafayette",
"county": "contracosta",
"state": "CA",
"zipcode": "94549"
},
{
"name": "Lake Merritt",
"abbr": "LAKE",
"gtfs_latitude": "37.797027",
"gtfs_longitude": "-122.265180",
"address": "800 Madison Street",
"city": "Oakland",
"county": "alameda",
"state": "CA",
"zipcode": "94607"
},
{
"name": "MacArthur",
"abbr": "MCAR",
"gtfs_latitude": "37.829065",
"gtfs_longitude": "-122.267040",
"address": "555 40th Street",
"city": "Oakland",
"county": "alameda",
"state": "CA",
"zipcode": "94609"
},
{
"name": "Millbrae",
"abbr": "MLBR",
"gtfs_latitude": "37.600271",
"gtfs_longitude": "-122.386702",
"address": "200 North Rollins Road",
"city": "Millbrae",
"county": "sanmateo",
"state": "CA",
"zipcode": "94030"
},
{
"name": "Montgomery St.",
"abbr": "MONT",
"gtfs_latitude": "37.789405",
"gtfs_longitude": "-122.401066",
"address": "598 Market Street",
"city": "San Francisco",
"county": "sanfrancisco",
"state": "CA",
"zipcode": "94104"
},
{
"name": "North Berkeley",
"abbr": "NBRK",
"gtfs_latitude": "37.873967",
"gtfs_longitude": "-122.283440",
"address": "1750 Sacramento Street",
"city": "Berkeley",
"county": "alameda",
"state": "CA",
"zipcode": "94702"
},
{
"name": "North Concord/Martinez",
"abbr": "NCON",
"gtfs_latitude": "38.003193",
"gtfs_longitude": "-122.024653",
"address": "3700 Port Chicago Highway",
"city": "Concord",
"county": "contracosta",
"state": "CA",
"zipcode": "94520"
},
{
"name": "Oakland International Airport",
"abbr": "OAKL",
"gtfs_latitude": "37.713238",
"gtfs_longitude": "-122.212191",
"address": "4 Airport Drive",
"city": "Oakland",
"county": "alameda",
"state": "CA",
"zipcode": "94621"
},
{
"name": "Orinda",
"abbr": "ORIN",
"gtfs_latitude": "37.878361",
"gtfs_longitude": "-122.183791",
"address": "11 Camino Pablo",
"city": "Orinda",
"county": "contracosta",
"state": "CA",
"zipcode": "94563"
},
{
"name": "Pittsburg/Bay Point",
"abbr": "PITT",
"gtfs_latitude": "38.018914",
"gtfs_longitude": "-121.945154",
"address": "1700 West Leland Road",
"city": "Pittsburg",
"county": "contracosta",
"state": "CA",
"zipcode": "94565"
},
{
"name": "Pittsburg Center",
"abbr": "PCTR",
"gtfs_latitude": "38.016941",
"gtfs_longitude": "-121.889457",
"address": "2099 Railroad Avenue",
"city": "Pittsburg",
"county": "Contra Costa",
"state": "CA",
"zipcode": "94565"
},
{
"name": "Pleasant Hill/Contra Costa Centre",
"abbr": "PHIL",
"gtfs_latitude": "37.928468",
"gtfs_longitude": "-122.056012",
"address": "1365 Treat Blvd.",
"city": "Walnut Creek",
"county": "contracosta",
"state": "CA",
"zipcode": "94597"
},
{
"name": "Powell St.",
"abbr": "POWL",
"gtfs_latitude": "37.784471",
"gtfs_longitude": "-122.407974",
"address": "899 Market Street",
"city": "San Francisco",
"county": "sanfrancisco",
"state": "CA",
"zipcode": "94102"
},
{
"name": "Richmond",
"abbr": "RICH",
"gtfs_latitude": "37.936853",
"gtfs_longitude": "-122.353099",
"address": "1700 Nevin Avenue",
"city": "Richmond",
"county": "contracosta",
"state": "CA",
"zipcode": "94801"
},
{
"name": "Rockridge",
"abbr": "ROCK",
"gtfs_latitude": "37.844702",
"gtfs_longitude": "-122.251371",
"address": "5660 College Avenue",
"city": "Oakland",
"county": "alameda",
"state": "CA",
"zipcode": "94618"
},
{
"name": "San Bruno",
"abbr": "SBRN",
"gtfs_latitude": "37.637761",
"gtfs_longitude": "-122.416287",
"address": "1151 Huntington Avenue",
"city": "San Bruno",
"county": "sanmateo",
"state": "CA",
"zipcode": "94066"
},
{
"name": "San Francisco International Airport",
"abbr": "SFIA",
"gtfs_latitude": "37.615966",
"gtfs_longitude": "-122.392409",
"address": "International Terminal, Level 3",
"city": "San Francisco Int'l Airport",
"county": "sanmateo",
"state": "CA",
"zipcode": "94128"
},
{
"name": "San Leandro",
"abbr": "SANL",
"gtfs_latitude": "37.721947",
"gtfs_longitude": "-122.160844",
"address": "1401 San Leandro Blvd.",
"city": "San Leandro",
"county": "alameda",
"state": "CA",
"zipcode": "94577"
},
{
"name": "South Hayward",
"abbr": "SHAY",
"gtfs_latitude": "37.634375",
"gtfs_longitude": "-122.057189",
"address": "28601 Dixon Street",
"city": "Hayward",
"county": "alameda",
"state": "CA",
"zipcode": "94544"
},
{
"name": "South San Francisco",
"abbr": "SSAN",
"gtfs_latitude": "37.664245",
"gtfs_longitude": "-122.443960",
"address": "1333 Mission Road",
"city": "South San Francisco",
"county": "sanmateo",
"state": "CA",
"zipcode": "94080"
},
{
"name": "Union City",
"abbr": "UCTY",
"gtfs_latitude": "37.590630",
"gtfs_longitude": "-122.017388",
"address": "10 Union Square",
"city": "Union City",
"county": "alameda",
"state": "CA",
"zipcode": "94587"
},
{
"name": "Walnut Creek",
"abbr": "WCRK",
"gtfs_latitude": "37.905522",
"gtfs_longitude": "-122.067527",
"address": "200 Ygnacio Valley Road",
"city": "Walnut Creek",
"county": "contracosta",
"state": "CA",
"zipcode": "94596"
},
{
"name": "Warm Springs/South Fremont",
"abbr": "WARM",
"gtfs_latitude": "37.502171",
"gtfs_longitude": "-121.939313",
"address": "45193 Warm Springs Blvd",
"city": "Fremont",
"county": "alameda",
"state": "CA",
"zipcode": "94539"
},
{
"name": "West Dublin/Pleasanton",
"abbr": "WDUB",
"gtfs_latitude": "37.699756",
"gtfs_longitude": "-121.928240",
"address": "6501 Golden Gate Drive",
"city": "Dublin",
"county": "alameda",
"state": "CA",
"zipcode": "94568"
},
{
"name": "West Oakland",
"abbr": "WOAK",
"gtfs_latitude": "37.804872",
"gtfs_longitude": "-122.295140",
"address": "1451 7th Street",
"city": "Oakland",
"county": "alameda",
"state": "CA",
"zipcode": "94607"
}
]
},
"message": ""
}
}"""

    val commandMap = mapOf(
        "help" to help,
        "stninfo" to stninfo,
        "stnaccess" to stnaccess,
        "stns" to stns
    )
}