
package com.kenai.jaffl.provider.jffi;

import com.kenai.jaffl.LibraryOption;
import java.util.Map;

abstract class LibraryLoader {
    abstract <T> T loadLibrary(Library library, Class<T> interfaceClass, Map<LibraryOption, ?> libraryOptions);
}