package com.elitsa.libraries.cinemaapp.db.daos;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.elitsa.libraries.cinemaapp.db.entities.ActorEntity;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class ActorDao_Impl implements ActorDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<ActorEntity> __insertionAdapterOfActorEntity;

  private final EntityDeletionOrUpdateAdapter<ActorEntity> __deletionAdapterOfActorEntity;

  private final SharedSQLiteStatement __preparedStmtOfDeleteActorsOfMovie;

  public ActorDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfActorEntity = new EntityInsertionAdapter<ActorEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `ActorEntity` (`id`,`name`,`photo_url`,`movie_id`) VALUES (?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ActorEntity value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getPhotoUrl() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getPhotoUrl());
        }
        stmt.bindLong(4, value.getMovieId());
      }
    };
    this.__deletionAdapterOfActorEntity = new EntityDeletionOrUpdateAdapter<ActorEntity>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `ActorEntity` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ActorEntity value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__preparedStmtOfDeleteActorsOfMovie = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM actorentity WHERE movie_id LIKE ?";
        return _query;
      }
    };
  }

  @Override
  public Object saveActors(final List<ActorEntity> actor, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfActorEntity.insert(actor);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object deleteActor(final ActorEntity actor, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfActorEntity.handle(actor);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object deleteActorsOfMovie(final int movieId, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteActorsOfMovie.acquire();
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, movieId);
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteActorsOfMovie.release(_stmt);
        }
      }
    }, p1);
  }

  @Override
  public Object getActors(final Continuation<? super List<ActorEntity>> p0) {
    final String _sql = "SELECT * FROM actorentity";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.execute(__db, false, new Callable<List<ActorEntity>>() {
      @Override
      public List<ActorEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfPhotoUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "photo_url");
          final int _cursorIndexOfMovieId = CursorUtil.getColumnIndexOrThrow(_cursor, "movie_id");
          final List<ActorEntity> _result = new ArrayList<ActorEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final ActorEntity _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final String _tmpPhotoUrl;
            _tmpPhotoUrl = _cursor.getString(_cursorIndexOfPhotoUrl);
            final int _tmpMovieId;
            _tmpMovieId = _cursor.getInt(_cursorIndexOfMovieId);
            _item = new ActorEntity(_tmpId,_tmpName,_tmpPhotoUrl,_tmpMovieId);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p0);
  }
}
