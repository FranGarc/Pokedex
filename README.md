# Pokedex

POC app using [pokemon api](https://pokeapi.co/docs/v2) to practice android/kotlin

## Table of contents

* [Requisites](#requisites)
* [Analysis](#analysis)
* [Architecture](#architecture)
* [Technologies](#technologies)
* [Credits](#credits)

## Requisites

At launch, the Pokedex will will download the full available list of pokemon
from  [pokemon api](https://pokeapi.co/docs/v2). If the number of pokemon is bigger than the number
of pokemon stored in the pokedex database, the newer pokemon list will be saved to the local
database.

The Pokedex screen will show the entries in the pokemon list saved in the database.

Tapping on one of the entries will open a Detail screen where more information of the pokemon will
be retrieved from the api and displayed on the screen.

The detail screen will have an option to "catch" the pokemon, saving it to a personal list of
caught pokemon. Catching a pokemon gives the user the chance to give it a nickname.

The app will also have a screen to show a list of "caught pokemon". In this list, any caught
pokemon with a nickname given by the user will display said nickname - e.g. "Roger" instead of "
Pikachu".

Any pokemon list (both pokedex and caught) will display its entries' name (or nickname) and image.

Any pokemon list (both pokedex and caught) screen will have a search bar on the top of the screen
which will work as live search box.

The app will have a botton navigation component to choose which of the lists the user wants to see.
The default list will be the "pokedex list".

A settings option

## Analysis

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
* MyPokemonList and MyPokemonListEntry for the user's caught pokemon
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

## Credits

* Launcher icon
  from [Pokedex Icon # 255172](https://icon-library.com/icon/pokedex-icon-19.html.html)
* Pokemon Types icons from https://github.com/duiker101/pokemon-type-svg-icons
* Pokeball icon from https://www.flaticon.es/icono-gratis/pokebola_824365
