

import com.sun.tools.javac.code.Symtab;
import com.sun.tools.javac.code.Types;
import com.sun.tools.javac.jvm.Code;
import com.sun.tools.javac.jvm.Items;
import com.sun.tools.javac.jvm.Pool;

import java.time.Year;

public class Music extends Items {

    private String genre, format, year, artist;

    public Music(Pool pool, Code code, Symtab syms, Types types, String genre, String format, String year, String artist) {
        super(pool, code, syms, types);
        this.genre = genre;
        this.format = format;
        this.year = year;
        this.artist = artist;
    }
}
