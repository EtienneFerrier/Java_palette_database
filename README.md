# Java Palette Database

For the course of computational photography CS-413

## Synopsis

This is an implementation in Java of a palette database with suggestion tools.  

The palette database examples are from Adobe Kuler [most popular palettes](https://color.adobe.com/explore/most-popular/?time=all).  
Two suggestion mechanisms are available, by *semantic relatedness* and by *color proximity*.  
  1. Semantic suggestions use WS4J (Word Net) to find palettes in the database which name is related to a word query.  
  2. Colorspace suggestions find palettes in the database which are perceptually close to a palette query.

## Libraries
All required jars are included in the project.  
The [Jawjaw](https://code.google.com/archive/p/jawjaw/) library contains the wordnet database.  
The [WS4J](https://code.google.com/archive/p/ws4j/) library contains the word similarity interface.

## Palettes data
Example databases are stored as CSV files in the `data/` folder.  
`kuler1_pos.csv`contains ~70 palettes, `kuler3_pos.csv` contains ~1000 palettes.  
For now, the database only handles 5-colors palettes.  
For each palette, the CSV files also contain POS tags for the name of the palette.

## Demo

You can try the database and suggestion system by running Demo.java.  
The typical output should be: 

```
Suggestions from the palette database -> by semantic relatedness:
For the word: sadness
--------------
clouds of sadness : #212226, #45433F, #687067, #BDBB99, #F0EAC3
spring happiness : #AF7575, #EFD8A1, #BCD693, #AFD7DB, #3D9CA8
feeling etsy : #DCEBDD, #A0D5D6, #789AA1, #304345, #AD9A27
satellite of love : #FDFF98, #A7DB9E, #211426, #6B073B, #DA8C25
hope springs eternal : #4B5657, #969481, #D2C9B0, #F4E3C1, #B6B835


Suggestions from the palette database -> by RGB L2 distance:
For palette: clouds of sadness : #212226, #45433F, #687067, #BDBB99, #F0EAC3
--------------
clouds of sadness : #212226, #45433F, #687067, #BDBB99, #F0EAC3
watercolor moon : #261F26, #3F3B40, #6C7367, #BFBF8A, #F2E086
dreams forever : #211426, #413659, #656F8C, #9BBFAB, #F2EFDF
boompjes : #141F26, #2B4040, #405950, #A69E86, #F2D9BB
celtic : #47191C, #59574B, #829690, #B5B09A, #E1E3CB
```

## TODO:
1. Replace RGB L2 distance by Lab colorspace or a "mood" colorspace
2. Add support for 3-palettes and X-palettes
2. Try on Android
3. Optimize
4. Consider precomputing suggestions for palettes in the database for faster loading
5. Add palettes to the database
