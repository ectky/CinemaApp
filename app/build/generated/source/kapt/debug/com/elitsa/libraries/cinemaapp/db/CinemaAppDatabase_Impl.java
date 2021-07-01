package com.elitsa.libraries.cinemaapp.db;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import com.elitsa.libraries.cinemaapp.db.daos.ActorDao;
import com.elitsa.libraries.cinemaapp.db.daos.ActorDao_Impl;
import com.elitsa.libraries.cinemaapp.db.daos.MovieDao;
import com.elitsa.libraries.cinemaapp.db.daos.MovieDao_Impl;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class CinemaAppDatabase_Impl extends CinemaAppDatabase {
  private volatile MovieDao _movieDao;

  private volatile ActorDao _actorDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `MovieEntity` (`id` INTEGER NOT NULL, `photo_url` TEXT, `name` TEXT, `rate` REAL NOT NULL, `description` TEXT, `studio` TEXT, `genres` TEXT, `releaseDate` TEXT, `is_favorite` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `ActorEntity` (`id` INTEGER NOT NULL, `name` TEXT, `photo_url` TEXT, `movie_id` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '6556bf5f14bd667070ee273f74a4bf0c')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `MovieEntity`");
        _db.execSQL("DROP TABLE IF EXISTS `ActorEntity`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsMovieEntity = new HashMap<String, TableInfo.Column>(9);
        _columnsMovieEntity.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieEntity.put("photo_url", new TableInfo.Column("photo_url", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieEntity.put("name", new TableInfo.Column("name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieEntity.put("rate", new TableInfo.Column("rate", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieEntity.put("description", new TableInfo.Column("description", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieEntity.put("studio", new TableInfo.Column("studio", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieEntity.put("genres", new TableInfo.Column("genres", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieEntity.put("releaseDate", new TableInfo.Column("releaseDate", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieEntity.put("is_favorite", new TableInfo.Column("is_favorite", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysMovieEntity = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesMovieEntity = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoMovieEntity = new TableInfo("MovieEntity", _columnsMovieEntity, _foreignKeysMovieEntity, _indicesMovieEntity);
        final TableInfo _existingMovieEntity = TableInfo.read(_db, "MovieEntity");
        if (! _infoMovieEntity.equals(_existingMovieEntity)) {
          return new RoomOpenHelper.ValidationResult(false, "MovieEntity(com.elitsa.libraries.cinemaapp.db.entities.MovieEntity).\n"
                  + " Expected:\n" + _infoMovieEntity + "\n"
                  + " Found:\n" + _existingMovieEntity);
        }
        final HashMap<String, TableInfo.Column> _columnsActorEntity = new HashMap<String, TableInfo.Column>(4);
        _columnsActorEntity.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsActorEntity.put("name", new TableInfo.Column("name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsActorEntity.put("photo_url", new TableInfo.Column("photo_url", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsActorEntity.put("movie_id", new TableInfo.Column("movie_id", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysActorEntity = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesActorEntity = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoActorEntity = new TableInfo("ActorEntity", _columnsActorEntity, _foreignKeysActorEntity, _indicesActorEntity);
        final TableInfo _existingActorEntity = TableInfo.read(_db, "ActorEntity");
        if (! _infoActorEntity.equals(_existingActorEntity)) {
          return new RoomOpenHelper.ValidationResult(false, "ActorEntity(com.elitsa.libraries.cinemaapp.db.entities.ActorEntity).\n"
                  + " Expected:\n" + _infoActorEntity + "\n"
                  + " Found:\n" + _existingActorEntity);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "6556bf5f14bd667070ee273f74a4bf0c", "c03af748068e07812c0de440a86c484c");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "MovieEntity","ActorEntity");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `MovieEntity`");
      _db.execSQL("DELETE FROM `ActorEntity`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public MovieDao moviesDao() {
    if (_movieDao != null) {
      return _movieDao;
    } else {
      synchronized(this) {
        if(_movieDao == null) {
          _movieDao = new MovieDao_Impl(this);
        }
        return _movieDao;
      }
    }
  }

  @Override
  public ActorDao actorsDao() {
    if (_actorDao != null) {
      return _actorDao;
    } else {
      synchronized(this) {
        if(_actorDao == null) {
          _actorDao = new ActorDao_Impl(this);
        }
        return _actorDao;
      }
    }
  }
}
