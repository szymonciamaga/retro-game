package com.github.retro_game.retro_game.service.impl;

import com.github.retro_game.retro_game.model.entity.Event;

interface EventHandler {
  void handle(Event event);
}
