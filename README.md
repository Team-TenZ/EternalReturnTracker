Original App Design Project
===

# Eternal Return Stat Tracker

## Table of Contents
1. [Overview](#Overview)
1. [Product Spec](#Product-Spec)
1. [Wireframes](#Wireframes)
2. [Schema](#Schema)

## Overview
### Description
This app allows the user to track other player's stats and win rates in the game Eternal Return. The app also provides ...

### App Evaluation
- **Category:** Reference
- **Mobile:** This app would be primarily developed for mobile but would be just as viable on a computer, such as tinder or other similar apps. Functionality wouldn’t be limited to mobile devices, however mobile version could potentially have more features.
- **Story:** Analyzes users game data, and compares them to other users to show relative skill level.
- **Market:** Any player of Eternal Return can use this app.
- **Habit:** This app could be used as often or unoften as the user wants depending on how focused they are on the game and their stats.
- **Scope:** This app will be finished in around 4 weeks and should have all of the user functionality below.

## Product Spec

### 1. User Stories (Required and Optional)

**Required Must-have Stories**

* [Search Function]
1. [x] User can look-up and favorite different accounts in one tab.
      * [x] User will be able to see the account's match history and character choices.
      * [x] Simple stats such as win rates, and average placement of the account will be shown as well.
* [Character Select]
2. [x] User can select a character from a list in another tab.
* [Ranking View]
3. [x] User can see the top rankings in another tab.

**Optional Nice-to-have Stories**


### 2. Screen Archetypes

* [x] [Search Screen]
   * [x] [Search Function]
* [x] [Character Screen]
   * [x] [Character Select]
* [x] [Ranking Screen]
   * [x] [Ranking View]


### 3. Navigation

**Tab Navigation** (Tab to Screen)

* [x] [Search]
* [x] [Character]
* [x] [Ranking]

**Flow Navigation** (Screen to Screen)

* [Search Screen]
   * [Account Screen]
* [Character Select]
   * [Specific Character Screen]
* [Ranking Screen]


## Progress Gifs
<img src='https://github.com/Team-TenZ/EternalReturnTracker/blob/main/update1.gif' title='Interactive Prototype' width='' />
<img src='https://github.com/Team-TenZ/EternalReturnTracker/blob/main/update2.gif' title='Interactive Prototype' width='' />


## Wireframes

### [BONUS] Digital Wireframes & Mockups
<img src="https://cdn.discordapp.com/attachments/169575828965949441/827761177894846514/wireframes.png" width=600>
<img src="https://cdn.discordapp.com/attachments/378420172421332992/827761405390225418/unknown.png" width=600>

### [BONUS] Interactive Prototype
<img src='https://github.com/Team-TenZ/EternalReturnTracker/blob/main/Interactive_Prototype.gif' title='Interactive Prototype' width='' />

## Schema 
### Models
#### Character

   | Property      | Type     | Description |
   | ------------- | -------- | ------------|
   | objectId      | String   | unique id for the chosen character  |
   | name        | String| charcter name |
   | image         | File     | image that is associated to character |
   | skillOrder       | Array Skills  | recommended leveling of skills |
   | pickRate | Number   | percent of time character is picked |
   | buildPath    | Pointer to Weapon   | recommended weapon path |
   | stats     | String | shows win rate and other various stats of character |
   | counter     | Pointer to Character | points to another Character that beats the selected one |
   
#### Player

   | Property      | Type     | Description |
   | ------------- | -------- | ------------|
   | objectId      | String   | unique id for the chosen player  |
   | name        | String| player name |
   | image         | File     | profile image that is associated to the player |
   | matchHistory       | String Array   | displays 10 most recent matches |
   | stats     | String | shows win rate and other various stats of the player |
   
#### Weapon

   | Property      | Type     | Description |
   | ------------- | -------- | ------------|
   | objectId      | String   | unique id for the chosen weapon  |
   | name        | String| weapon name |
   | image         | File     | image that is associated to the weapon |
   | description        | String| description of the weapon |
   
#### Skill

   | Property      | Type     | Description |
   | ------------- | -------- | ------------|
   | objectId      | String   | unique id for the chosen skill  |
   | name        | String| skill name |
   | image         | File     | image that is associated to the skill |
   | description        | String| description of the skill |
   
#### Leaderboard

   | Property      | Type     | Description |
   | ------------- | -------- | ------------|
   | objectId      | String   | unique id for the leaderboard |
   | players        | Array of Players| lists current top 10 players |
   | updatedAt     | DateTime | date when leaderboard is last updated |
   
### Networking
#### List of network requests by screen
   - Search Screen
      - (Read/GET) Query account
      - (Update/PUT) Favorite account
      - (Delete) Delete existing favorite
   - Account Screen
      - (Read/GET) Query account information

   - Rankings Screen
      - (Read/GET) Query all top accounts and user accounts' rankings
      - (Update/PUT) Favorite account
      - (Delete) Delete existing favorite
   
   - Characters Screen
      - (Read/GET) Get character information
   
   - Favorites Screen
      - (Read/GET) Query all favorites
      - (Delete) Delete existing favorite
- [OPTIONAL: List endpoints if using existing API such as Yelp]
