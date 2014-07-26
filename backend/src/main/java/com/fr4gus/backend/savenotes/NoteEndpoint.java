package com.fr4gus.backend.savenotes;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import javax.inject.Named;

/** An endpoint class we are exposing */
@Api(name = "noteEndpoint", version = "v1", namespace = @ApiNamespace(ownerDomain = "savenotes.backend.fr4gus.com", ownerName = "savenotes.backend.fr4gus.com", packagePath=""))
public class NoteEndpoint {

    // TODO in memory implementation to test endpoints
    static Map<Long, Note> mLocalNotes = new HashMap<Long, Note>();
    static long mLastId = 0;


    private static final Logger LOG = Logger.getLogger(NoteEndpoint.class.getName());

    /**
     * This method gets the <code>Note</code> object associated with the specified <code>id</code>.
     * @param id The id of the object to be returned.
     * @return The <code>Note</code> associated with <code>id</code>.
     */
    @ApiMethod(name = "getNote")
    public Note getNote(@Named("id") Long id) {
        LOG.info("Calling getNote method");
        return mLocalNotes.get(id);
    }

    /**
     * This inserts a new <code>Note</code> object.
     * @param note The object to be added.
     * @return The object to be added.
     */
    @ApiMethod(name = "insertNote")
    public Note insertNote(Note note) {
        LOG.info("Calling insertNote method");

        synchronized (mLocalNotes) {
            mLastId++;
            mLocalNotes.put(mLastId,note);
            note.setId(mLastId);
        }

        return note;
    }


    /**
     * This returns all stored <code>Note</code> objects stored in the service
     * @return a list of all notes
     */
    @ApiMethod(name = "listNotes", path = "note/list")
    public List<Note> listNotes() {
        ArrayList<Note> notes = new ArrayList<Note>();
        notes.addAll(mLocalNotes.values());
        return notes;
    }
}