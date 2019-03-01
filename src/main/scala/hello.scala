/* --- Exercicie 1 --- */

def last (list:List[Int]) : Option[Int] = list match { 
  case head :: Nil => head
  case head :: tail => last(tail) 
  case _ => None
}

/* --- Exercice 2 --- */

def nth (n:Int, list:List[Int]) : Option[Int] = list match {
  case h :: t => if (n == 0) Some(h) else nth(n-1, t)
  case Nil => None
}

/* --- Exercice 3 --- */

def reverse(list:List[Int]) : Option[Int] = list match {
  case h :: tail => reverse(tail) ::: List(h)
  case Nil => Nil
}

/* --- Exercice 4 --- */

import utils.packer

def encode[A](l: List[A]):List[(Int, A)] = {
    def _encode(res: List[(Int, A)], rem: List[List[A]]):List[(Int, A)] = rem match {
        case Nil => res
        case h::tail => _encode(res:::List((h.length, h.head)), tail)
    }
    _encode(List(), utils.packer.pack(l))
}

