# Pokedex

POC app using [pokeapi](https://pokeapi.co/docs/v2) to practice android/kotlin

## Table of contents

* [Requisites](#requisites)
* [Analysis](#analysis)
* [Architecture](#architecture)
* [Technologies](#technologies)
* [Credits](#credits)

## Requisites

### User Stories

1. As user, when I launch the app I want to see the full list of existing pokemon so I can scroll
   through it.
2. As user, when I launch the app, if I have no connectivity, I want to see the last downloaded
   list, so I can scroll through it.
3. As user, I want the list entries to contain the species name and the picture of each pokemon.
4. As user, I want to be able to search for a specific pokemon by entering all or part of its
   species name.
5. As user, when I tap on one of the pokemon list entries, I want to see more information of that
   pokemon.
6. As user, when I see the information of a pokemon, I want to be able to catch it.
7. As user, when I catch a pokemon, I want to be given the option to give it a nickname.
8. As user, I want to be able to see the list of pokemon I've caught, so I can scroll through it.
9. As user, I want the list of my captured pokemon to use the nickname instead of the species name.
10. As user, I want to be able to search for a specific pokemon by entering all or part of its
    nickname (or species name, if no nickname was chosen).
11. As user, I want to be able to order my captured pokemon list by different criteria: date of
    capture, nickname, pokedex number (see story #3)

## Analysis

### Milestones

#### Milestone 0. Project Setup.

##### Repository branches.

Branch Master will be used for releases.

Branch Develop will hold the progress of the tasks.

##### Git Flow.

Each Milestone will be a new branch from Develop. No new Milestone branches while the existing one
hasn't been merged into Develop definitely.

    E.g.: milestone01

Each User Story will be coded in a new branch from its Milestone Branch. Once it's finished, we'll
open a PR to review it and merge it into the Milestone Branch again.

    E.g.: task/us01-list-all-pokemon

Once all User Stories have been merged into the Milestone Branch, this later can be merged into
Develop, with the milestone tag, for testing.

    E.g.: tag M.1

If any bugs arise during testing, the relevant hotfix will be applied and it will be tested again.

    E.g.: hotfix/tapping-reveals-wrong-pokemon-details

Once testing results are satisfactory, current milestone can be released - i.e., merged into Master
and tagged with the proper version.

    E.g.: tag v-1.0.0

##### Android Project setup.

Create BuildSrc module for Dependency management.

Include all dependencies listed in [Technologies](#technologies)

Create data and domain modules.

#### Milestone 1. Remote Data.

For the first milestone, we'll include the US 1, 3, 5, which involve connecting to the API and
retrieving remote data.

##### Tasks for Milestone 1

1. Create Entry component, which will hold the name and picture of the pokemon for the list.
2. Create a Detail Screen as per the wireframes. It will receive the pokemon object to be displayed
3. Create a PokedexList Screen which will display the entries received from the API, using the
   component cretaed in #1
4. Set up the navigation from the PokedexList Screen to the Detail Screen

We will develop the list screen as the wireframes show. We won't add behaviours for the bottom
navigation nor for the search bar.

### UI Design (Wireframe)

<img  alt="Master list screen" src="https://github.com/FranGarc/Pokedex/blob/master/screenshots/pokedex_list.png" width="200" heght="300"/>

<img  alt="Detail screen" src="https://github.com/FranGarc/Pokedex/blob/master/screenshots/pokemon_detail.png" width="200" heght="300"/>

### Implementation Details

At launch, the Pokedex will download the full available list of pokemon
from  [pokeapi](https://pokeapi.co/docs/v2). If the number of pokemon is bigger than the number
of pokemon stored in the pokedex database, the newer pokemon list will be saved to the local
database. This can be done during a splash screen.

The Pokedex screen will show the pokemon from the list that was saved in the database.

Tapping on one of the entries will open a Detail screen where more information of the pokemon will
be retrieved from the pokeapi and displayed on the screen.

The detail screen will have an option to "catch" the pokemon, saving it to a personal list of
pokemon captured by the user. Catching a pokemon gives the user the chance to give it a nickname. It
will default to the pokemon species name, but the user will be able to edit it. An empty nickname
will also default to the species name.

The app will also have a screen to show a list of "pokemon captured by the user". In this list, any
pokemon the user captured, showing the nickname given by the user - e.g. "Roger" instead of "
Pikachu".

Any pokemon list (both pokedex and caught) will display its entries' name (or nickname) and image.

The app will have a botton navigation component to choose which of the lists the user wants to see.

The default screen will be the "pokedex list".

A settings option

We'll need

* UI library for screens design and navigation (Jetpack Compose)
* HTTP client for kotlin to interact with the API: Retrofit
* A Library to load images from URL that is compatible with UI library: Coil-Compose
* A local database: Room
* A way to persist the user's configuration of the app: Data Storage
* A framework to assist with the Dependency Injection

Entities:

* PokedexList and PokedexListEntry
* PokedexPokemon to see the details
* MyPokemonList and MyPokemonListEntry for the pokemon captured by the user
* MyPokemon to see the details of any user's caught pokemon (including nickname and date of capture)

UseCases:

* GetPokedexList
* GetPokedexPokemonDetails
* CatchPokemon
* GetMyList
* GetMyPokemonDetails

## Architecture

We'll opt for the 3 layers (presentation, domain, data) clean architecture.

### Design and Presentation Patterns

* MVVM
* Repository pattern

## Technologies

Project is created with:

* Retrofit (remote API client)
* Flow (live updates)
* Jetpack Compose (UI)
* Navigation component (navigation between screens)
* Room database (data persistance)
* Dagger Hilt (dependencies injection)
* Data Storage (settings)
* Timber (logging)

## Credits

* Launcher icon
  from [Pokedex Icon # 255172](https://icon-library.com/icon/pokedex-icon-19.html.html)
* Pokemon Types icons from https://github.com/duiker101/pokemon-type-svg-icons
* Pokeball icon from https://www.flaticon.es/icono-gratis/pokebola_824365
