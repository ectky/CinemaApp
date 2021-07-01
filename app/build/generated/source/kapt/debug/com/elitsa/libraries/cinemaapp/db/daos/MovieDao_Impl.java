package com.elitsa.libraries.cinemaapp.db.daos;

import android.database.Cursor;
import androidx.collection.LongSparseArray;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.elitsa.libraries.cinemaapp.db.entities.ActorEntity;
import com.elitsa.libraries.cinemaapp.db.entities.MovieEntity;
import com.elitsa.libraries.cinemaapp.db.entities.MovieWithActors;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class MovieDao_Impl implements MovieDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<MovieEntity> __insertionAdapterOfMovieEntity;

  private final EntityDeletionOrUpdateAdapter<MovieEntity> __deletionAdapterOfMovieEntity;

  public MovieDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfMovieEntity = new EntityInsertionAdapter<MovieEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `MovieEntity` (`id`,`photo_url`,`name`,`rate`,`description`,`studio`,`genres`,`releaseDate`,`is_favorite`) VALUES (?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, MovieEntity value) {
        stmt.bindLong(1, value.getId());
        if (value.getPhotoUrl() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getPhotoUrl());
        }
        if (value.getName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getName());
        }
        stmt.bindDouble(4, value.getRating());
        if (value.getDescription() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getDescription());
        }
        if (value.getStudio() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getStudio());
        }
        if (value.getGenres() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getGenres());
        }
        if (value.getReleaseDate() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getReleaseDate());
        }
        final int _tmp;
        _tmp = value.isFavorite() ? 1 : 0;
        stmt.bindLong(9, _tmp);
      }
    };
    this.__deletionAdapterOfMovieEntity = new EntityDeletionOrUpdateAdapter<MovieEntity>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `MovieEntity` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, MovieEntity value) {
        stmt.bindLong(1, value.getId());
      }
    };
  }

  @Override
  public Object saveMovie(final MovieEntity movie, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfMovieEntity.insert(movie);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object removeMovie(final MovieEntity movie, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfMovieEntity.handle(movie);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object getSavedMovieEntities(final Continuation<? super List<MovieEntity>> p0) {
    final String _sql = "SELECT * FROM movieentity";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.execute(__db, false, new Callable<List<MovieEntity>>() {
      @Override
      public List<MovieEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfPhotoUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "photo_url");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfRating = CursorUtil.getColumnIndexOrThrow(_cursor, "rate");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfStudio = CursorUtil.getColumnIndexOrThrow(_cursor, "studio");
          final int _cursorIndexOfGenres = CursorUtil.getColumnIndexOrThrow(_cursor, "genres");
          final int _cursorIndexOfReleaseDate = CursorUtil.getColumnIndexOrThrow(_cursor, "releaseDate");
          final int _cursorIndexOfIsFavorite = CursorUtil.getColumnIndexOrThrow(_cursor, "is_favorite");
          final List<MovieEntity> _result = new ArrayList<MovieEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final MovieEntity _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpPhotoUrl;
            _tmpPhotoUrl = _cursor.getString(_cursorIndexOfPhotoUrl);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final float _tmpRating;
            _tmpRating = _cursor.getFloat(_cursorIndexOfRating);
            final String _tmpDescription;
            _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            final String _tmpStudio;
            _tmpStudio = _cursor.getString(_cursorIndexOfStudio);
            final String _tmpGenres;
            _tmpGenres = _cursor.getString(_cursorIndexOfGenres);
            final String _tmpReleaseDate;
            _tmpReleaseDate = _cursor.getString(_cursorIndexOfReleaseDate);
            final boolean _tmpIsFavorite;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsFavorite);
            _tmpIsFavorite = _tmp != 0;
            _item = new MovieEntity(_tmpId,_tmpPhotoUrl,_tmpName,_tmpRating,_tmpDescription,_tmpStudio,_tmpGenres,_tmpReleaseDate,_tmpIsFavorite);
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

  @Override
  public Object getSavedMovie(final int movieId, final Continuation<? super MovieEntity> p1) {
    final String _sql = "SELECT * FROM movieentity WHERE id LIKE ? LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, movieId);
    return CoroutinesRoom.execute(__db, false, new Callable<MovieEntity>() {
      @Override
      public MovieEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfPhotoUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "photo_url");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfRating = CursorUtil.getColumnIndexOrThrow(_cursor, "rate");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfStudio = CursorUtil.getColumnIndexOrThrow(_cursor, "studio");
          final int _cursorIndexOfGenres = CursorUtil.getColumnIndexOrThrow(_cursor, "genres");
          final int _cursorIndexOfReleaseDate = CursorUtil.getColumnIndexOrThrow(_cursor, "releaseDate");
          final int _cursorIndexOfIsFavorite = CursorUtil.getColumnIndexOrThrow(_cursor, "is_favorite");
          final MovieEntity _result;
          if(_cursor.moveToFirst()) {
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpPhotoUrl;
            _tmpPhotoUrl = _cursor.getString(_cursorIndexOfPhotoUrl);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final float _tmpRating;
            _tmpRating = _cursor.getFloat(_cursorIndexOfRating);
            final String _tmpDescription;
            _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            final String _tmpStudio;
            _tmpStudio = _cursor.getString(_cursorIndexOfStudio);
            final String _tmpGenres;
            _tmpGenres = _cursor.getString(_cursorIndexOfGenres);
            final String _tmpReleaseDate;
            _tmpReleaseDate = _cursor.getString(_cursorIndexOfReleaseDate);
            final boolean _tmpIsFavorite;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsFavorite);
            _tmpIsFavorite = _tmp != 0;
            _result = new MovieEntity(_tmpId,_tmpPhotoUrl,_tmpName,_tmpRating,_tmpDescription,_tmpStudio,_tmpGenres,_tmpReleaseDate,_tmpIsFavorite);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p1);
  }

  @Override
  public LiveData<List<MovieWithActors>> getMoviesWithActors() {
    final String _sql = "SELECT * FROM movieentity";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"ActorEntity","movieentity"}, true, new Callable<List<MovieWithActors>>() {
      @Override
      public List<MovieWithActors> call() throws Exception {
        __db.beginTransaction();
        try {
          final Cursor _cursor = DBUtil.query(__db, _statement, true, null);
          try {
            final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
            final int _cursorIndexOfPhotoUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "photo_url");
            final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
            final int _cursorIndexOfRating = CursorUtil.getColumnIndexOrThrow(_cursor, "rate");
            final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
            final int _cursorIndexOfStudio = CursorUtil.getColumnIndexOrThrow(_cursor, "studio");
            final int _cursorIndexOfGenres = CursorUtil.getColumnIndexOrThrow(_cursor, "genres");
            final int _cursorIndexOfReleaseDate = CursorUtil.getColumnIndexOrThrow(_cursor, "releaseDate");
            final int _cursorIndexOfIsFavorite = CursorUtil.getColumnIndexOrThrow(_cursor, "is_favorite");
            final LongSparseArray<ArrayList<ActorEntity>> _collectionActors = new LongSparseArray<ArrayList<ActorEntity>>();
            while (_cursor.moveToNext()) {
              final long _tmpKey = _cursor.getLong(_cursorIndexOfId);
              ArrayList<ActorEntity> _tmpActorsCollection = _collectionActors.get(_tmpKey);
              if (_tmpActorsCollection == null) {
                _tmpActorsCollection = new ArrayList<ActorEntity>();
                _collectionActors.put(_tmpKey, _tmpActorsCollection);
              }
            }
            _cursor.moveToPosition(-1);
            __fetchRelationshipActorEntityAscomElitsaLibrariesCinemaappDbEntitiesActorEntity(_collectionActors);
            final List<MovieWithActors> _result = new ArrayList<MovieWithActors>(_cursor.getCount());
            while(_cursor.moveToNext()) {
              final MovieWithActors _item;
              final MovieEntity _tmpMovie;
              if (! (_cursor.isNull(_cursorIndexOfId) && _cursor.isNull(_cursorIndexOfPhotoUrl) && _cursor.isNull(_cursorIndexOfName) && _cursor.isNull(_cursorIndexOfRating) && _cursor.isNull(_cursorIndexOfDescription) && _cursor.isNull(_cursorIndexOfStudio) && _cursor.isNull(_cursorIndexOfGenres) && _cursor.isNull(_cursorIndexOfReleaseDate) && _cursor.isNull(_cursorIndexOfIsFavorite))) {
                final int _tmpId;
                _tmpId = _cursor.getInt(_cursorIndexOfId);
                final String _tmpPhotoUrl;
                _tmpPhotoUrl = _cursor.getString(_cursorIndexOfPhotoUrl);
                final String _tmpName;
                _tmpName = _cursor.getString(_cursorIndexOfName);
                final float _tmpRating;
                _tmpRating = _cursor.getFloat(_cursorIndexOfRating);
                final String _tmpDescription;
                _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
                final String _tmpStudio;
                _tmpStudio = _cursor.getString(_cursorIndexOfStudio);
                final String _tmpGenres;
                _tmpGenres = _cursor.getString(_cursorIndexOfGenres);
                final String _tmpReleaseDate;
                _tmpReleaseDate = _cursor.getString(_cursorIndexOfReleaseDate);
                final boolean _tmpIsFavorite;
                final int _tmp;
                _tmp = _cursor.getInt(_cursorIndexOfIsFavorite);
                _tmpIsFavorite = _tmp != 0;
                _tmpMovie = new MovieEntity(_tmpId,_tmpPhotoUrl,_tmpName,_tmpRating,_tmpDescription,_tmpStudio,_tmpGenres,_tmpReleaseDate,_tmpIsFavorite);
              }  else  {
                _tmpMovie = null;
              }
              ArrayList<ActorEntity> _tmpActorsCollection_1 = null;
              final long _tmpKey_1 = _cursor.getLong(_cursorIndexOfId);
              _tmpActorsCollection_1 = _collectionActors.get(_tmpKey_1);
              if (_tmpActorsCollection_1 == null) {
                _tmpActorsCollection_1 = new ArrayList<ActorEntity>();
              }
              _item = new MovieWithActors(_tmpMovie,_tmpActorsCollection_1);
              _result.add(_item);
            }
            __db.setTransactionSuccessful();
            return _result;
          } finally {
            _cursor.close();
          }
        } finally {
          __db.endTransaction();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  private void __fetchRelationshipActorEntityAscomElitsaLibrariesCinemaappDbEntitiesActorEntity(
      final LongSparseArray<ArrayList<ActorEntity>> _map) {
    if (_map.isEmpty()) {
      return;
    }
    // check if the size is too big, if so divide;
    if(_map.size() > RoomDatabase.MAX_BIND_PARAMETER_CNT) {
      LongSparseArray<ArrayList<ActorEntity>> _tmpInnerMap = new LongSparseArray<ArrayList<ActorEntity>>(androidx.room.RoomDatabase.MAX_BIND_PARAMETER_CNT);
      int _tmpIndex = 0;
      int _mapIndex = 0;
      final int _limit = _map.size();
      while(_mapIndex < _limit) {
        _tmpInnerMap.put(_map.keyAt(_mapIndex), _map.valueAt(_mapIndex));
        _mapIndex++;
        _tmpIndex++;
        if(_tmpIndex == RoomDatabase.MAX_BIND_PARAMETER_CNT) {
          __fetchRelationshipActorEntityAscomElitsaLibrariesCinemaappDbEntitiesActorEntity(_tmpInnerMap);
          _tmpInnerMap = new LongSparseArray<ArrayList<ActorEntity>>(RoomDatabase.MAX_BIND_PARAMETER_CNT);
          _tmpIndex = 0;
        }
      }
      if(_tmpIndex > 0) {
        __fetchRelationshipActorEntityAscomElitsaLibrariesCinemaappDbEntitiesActorEntity(_tmpInnerMap);
      }
      return;
    }
    StringBuilder _stringBuilder = StringUtil.newStringBuilder();
    _stringBuilder.append("SELECT `id`,`name`,`photo_url`,`movie_id` FROM `ActorEntity` WHERE `movie_id` IN (");
    final int _inputSize = _map.size();
    StringUtil.appendPlaceholders(_stringBuilder, _inputSize);
    _stringBuilder.append(")");
    final String _sql = _stringBuilder.toString();
    final int _argCount = 0 + _inputSize;
    final RoomSQLiteQuery _stmt = RoomSQLiteQuery.acquire(_sql, _argCount);
    int _argIndex = 1;
    for (int i = 0; i < _map.size(); i++) {
      long _item = _map.keyAt(i);
      _stmt.bindLong(_argIndex, _item);
      _argIndex ++;
    }
    final Cursor _cursor = DBUtil.query(__db, _stmt, false, null);
    try {
      final int _itemKeyIndex = CursorUtil.getColumnIndex(_cursor, "movie_id");
      if (_itemKeyIndex == -1) {
        return;
      }
      final int _cursorIndexOfId = CursorUtil.getColumnIndex(_cursor, "id");
      final int _cursorIndexOfName = CursorUtil.getColumnIndex(_cursor, "name");
      final int _cursorIndexOfPhotoUrl = CursorUtil.getColumnIndex(_cursor, "photo_url");
      final int _cursorIndexOfMovieId = CursorUtil.getColumnIndex(_cursor, "movie_id");
      while(_cursor.moveToNext()) {
        final long _tmpKey = _cursor.getLong(_itemKeyIndex);
        ArrayList<ActorEntity> _tmpRelation = _map.get(_tmpKey);
        if (_tmpRelation != null) {
          final ActorEntity _item_1;
          final int _tmpId;
          if (_cursorIndexOfId == -1) {
            _tmpId = 0;
          } else {
            _tmpId = _cursor.getInt(_cursorIndexOfId);
          }
          final String _tmpName;
          if (_cursorIndexOfName == -1) {
            _tmpName = null;
          } else {
            _tmpName = _cursor.getString(_cursorIndexOfName);
          }
          final String _tmpPhotoUrl;
          if (_cursorIndexOfPhotoUrl == -1) {
            _tmpPhotoUrl = null;
          } else {
            _tmpPhotoUrl = _cursor.getString(_cursorIndexOfPhotoUrl);
          }
          final int _tmpMovieId;
          if (_cursorIndexOfMovieId == -1) {
            _tmpMovieId = 0;
          } else {
            _tmpMovieId = _cursor.getInt(_cursorIndexOfMovieId);
          }
          _item_1 = new ActorEntity(_tmpId,_tmpName,_tmpPhotoUrl,_tmpMovieId);
          _tmpRelation.add(_item_1);
        }
      }
    } finally {
      _cursor.close();
    }
  }
}
