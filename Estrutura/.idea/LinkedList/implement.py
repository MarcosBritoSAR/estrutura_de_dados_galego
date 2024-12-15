from distutils.dep_util import newer
from socket import send_fds
from typing import no_type_check_decorator

from pkg_resources import non_empty_lines


class listaEncadeada:

    def __init__(self, key : str):
        initialElement = Node(key)

        self.firstElement = initialElement
        self.endElement = initialElement

    def add(self, newNode: 'Node'):
        self.endElement.add_next(newNode)
        self.endElement = newNode

    def delete(self):
        pass

    def first_end(self):
        self.firstElement.showNext()

    def end_first(self):
        self.endElement.showPrevious()

class Node:

    def __init__(self, key : str):
        self.key = key
        self.neighbor_previous = None
        self.neighbor_next = None

    def add_previous(self, prev: 'Node'):
        self.neighbor_previous = prev

    def add_next(self, next : 'Node'):
        self.neighbor_next = next
        next.add_previous(self)

    def showPrevious(self):
        print(self.str())
        if(self.neighbor_previous != None):
            self.neighbor_previous.showPrevious()

    def showNext(self):
        print(self.str())
        if(self.neighbor_next != None):
            self.neighbor_next.showNext()

    def str(self):
        return self.key


if __name__ == "__main__":
    list = listaEncadeada("10")
    list.add(Node("20"))
    list.add(Node("12"))
    list.add(Node("30"))

    list.end_first()