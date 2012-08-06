    def parse_stats
      regex = /(\d+)\s+examples?,\s+(\d+)\s+failures?(,\s+(\d+)\s+pending)?$/
      if @output =~ regex
        @total, @failed, @pending = $1.to_i, $2.to_i, $4.to_i
        @passed = @total - @failed - @pending
      else
        @output << "\nCan't parse output: #{@output_stream}"
      end
    end
