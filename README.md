# Java Palette Database

## Synopsis

This is an implementation in Java of a palette database with suggestion tools.

The palette database examples are from Adobe Kuler [most popular palettes](https://color.adobe.com/explore/most-popular/?time=all).
Two suggestion mechanisms are available, by *semantic relatedness* and by *color proximity*.
  1. Semantic suggestions use WS4J (Word Net) to find palettes in the database which name is related to a word query.
  2. Colorspace suggestions find palettes in the database which are perceptually close to a palette query.

## Implementation details

All required jars are included in the project.
The WS4J jar file is quite large: 40 Mb.
Example databases are stored as CSV files in the data folder.

## Demo

You can try the database and suggestion system by running Demo.java
The typical output should be: 

```
Suggestions from the palette database -> by semantic relatedness:
For the word: boat
--------------
Kayak : #36362C, #5D917D, #A8AD80, #E6D4A7, #825534
Bike Riders : #E82B1E, #E5DEAF, #A0B688, #557A66, #453625
Green Thumb : #075807, #097609, #70AF1A, #B9D40B, #E5EB0B
Ship Wreck : #372A26, #4D4D4D, #6DA0A7, #9ED5A8, #C7F5FF
Beetle Bus Goes Jamba Juice : #730046, #BFBB11, #FFC200, #E88801, #C93C00


Suggestions from the palette database -> by RGB L2 distance:
For palette: Kayak : #36362C, #5D917D, #A8AD80, #E6D4A7, #825534
--------------
Kayak : #36362C, #5D917D, #A8AD80, #E6D4A7, #825534
Indigo : #1F3642, #6D968D, #B6CCB8, #FFE2B3, #56493F
28x Dusty Petrol : #292929, #5B7876, #8F9E8B, #F2E6B6, #412A22
Modern Classic : #143840, #5C6B63, #A69E89, #E0C297, #D96523
Vintage Beach Wear : #473C35, #A36D5C, #9C968B, #D9CEAD, #8A866A
```
