    class WrongNumberOfPlayersError < StandardError ; end
     
    class NoSuchStrategyError < StandardError ; end
     
    class Array
      def beats?(player2)
        if rps_comparator(self[1], player2[1]) then
        return self
        end
        return player2
      end
     
      def match(regexp)
        return false
      end
    end
     
    def rps_game_winner(game)
      raise WrongNumberOfPlayersError unless game.length == 2
     
      player1 = game[0]
      player2 = game[1]
     
      player1.beats?(player2)
    end
     
    def rps_tournament_winner(tournament)
      if tournament[0][1].match(/[RPS]{1}/) && tournament[1][1].match(/[RPS]{1}/) then
        return rps_game_winner(tournament)
      else
        game = Array.new(2)
        game[0] = rps_tournament_winner(tournament[0])
        game[1] = rps_tournament_winner(tournament[1])
        return rps_game_winner(game)
      end
    end
     
    def rps_comparator(s1, s2)
      raise NoSuchStrategyError unless s1.match(/[RPS]{1}/) && s2.match(/[RPS]{1}/)
      if s1.eql?(s2) then return true end
      rules = { "R" => "P", "P" => "S", "S" => "R"}
      rules[s2] == s1
    end
