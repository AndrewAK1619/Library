package io.file;

/* Andrzej Kamiński */

import model.Library;

public interface FileManager {
    Library importData();
    void exportData(Library library);
}
