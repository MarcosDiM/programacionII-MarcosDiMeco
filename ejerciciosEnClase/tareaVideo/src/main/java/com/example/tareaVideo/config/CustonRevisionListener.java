package com.example.tareaVideo.config;

import com.example.tareaVideo.entities.audit.Revision;
import org.hibernate.envers.RevisionListener;

public class CustonRevisionListener implements RevisionListener {
    @Override
    public void newRevision(Object revisionEntity) {
        final Revision revision = (Revision) revisionEntity;
    }
}
