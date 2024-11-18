# Greenthread

## Discover Sustainability 🌱
Greenthread is an application built on the fundamentals of environmental sustainability with a focus on transparency 
in the clothing industry. 

The app is intended to provide two key features:
 - A QR Code scanner users can use to find information about an article of clothing and it's manufacturer
 - A search functionality that queries a from a database of clothing brands and provides information and
    ratings based on environmental key performance indicators

## Development so far
The front end of the application was designed in [Figma](https://www.figma.com/design/LN2UrjQ6HjA5Z9iMG6myKw/GreenThread-Android?node-id=0-1&t=CSjLUAMFD2smHKYI-1) during the Hello Hacks Hackathon with 3 other team members. 
An emphasis was placed on UI/UX fundamentals through the implementation of colour theory and ensuring an intuitive user experience. 
During the hackathon, a prototype of a QR code scanner was developed by leveraging the ZXing (Zebra Crossing) barcode library.
Following the hackathon, I took the initiatize to bring our project to life with the use of XML, Java and Android Studio's SDK. 

So far I've:
- Designed intuitive user interfaces using XML layouts to enhance the user experience and ensure smooth navigation across various activities and fragments
- Implemented the QR code scanner that was created during the hackathon.
- Integrated a custom Adapter object to allow for filtered searching through data passed in an activity.

## Further Development
There are still steps required before the minimal viable product is achieve.

Required implementations include:
- Linking either a NoSQL or SQL database containing the data pertaining to each clothing brand and article of clothing
- Narrowing the functionality of the QR code scanner to only consider codes that link to articles of clothing included in the database
- Developing the filter by keyword functionality with the search bar
