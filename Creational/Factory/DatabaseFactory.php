<?php
interface Database{
	public function connect();
	public function query();
}

class Mysql implements Database{
	public function connect(){
		echo "get mysql database connection";
	}
	public function query(){
		echo "query in mysql";
	}
}

class MongoDB implements Database{
	public function connect(){
		echo "get mongodb database connection";
	}
	public function query(){
		echo "query in mongodb";
	}
}

class DatabaseFactory{
	public $database;
	
	public function __construct(Database $db) {
	    $this->database = $db;
	}
	public function connect(){
		$this->database->connect();
		echo '<br/>';
	}

	public function query(){
		$this->database->query();
		echo '<br/>';
	}
}

$db = new DatabaseFactory(new Mysql);
$db->connect();
$db->query();
echo '<br/>';
$db2 = new DatabaseFactory(new MongoDB);
$db2->connect();
$db2->query();

?>
