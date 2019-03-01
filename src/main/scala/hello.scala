/* --- Exercicie 1 ---*/

def last (list:List[Int]):Int = list match { 
  case head :: Nil => head
  case head :: tail => last(tail) 
  case _ => None
}

/* --- Exercice 2 --- */

def nth (n:Int, list:List[Int] = Option[Int] = list match {
  case h :: t => if (n == 0) Some(h) else
}
