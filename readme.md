Hotel Bot Template
====================

A simple Hotel Booking Bot template running on Flask that's ready to run on Heroku.

[![Deploy](https://www.herokucdn.com/deploy/button.svg)](https://heroku.com/deploy)

## Development Setup

* `virtualenv venv`

* `source venv/bin/activate`

* `pip install -r requirements.txt`

* `python app.py`

## Deploy

* `heroku create`

* `heroku addons:create heroku-postgresql:hobby-dev`

* `git push heroku master`
