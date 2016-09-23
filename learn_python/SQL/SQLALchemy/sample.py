import sqlalchemy
from sqlalchemy import create_engine
from sqlalchemy.ext.declarative import declarative_base
from sqlalchemy import Column, Integer, String
from sqlalchemy.orm import sessionmaker

import pymssql
#engine=create_engine('sqlite:///:memory:', echo=False)

#engine = create_engine('mssql+pyodbc://server/database')
engine = create_engine('mssql+pymssql://SQL_user:password@localhost/sample_database')


Base = declarative_base()

class User(Base):
    __tablename__ = 'users'
    id = Column(Integer, primary_key=True)
    name = Column(String)
    fullname = Column(String)
    password = Column(String)

    def __repr__(self):
        return "<User(name='%s', fullname='%s', password='%s')>" % (self.name, self.fullname, self.password)


Base.metadata.create_all(engine)
'''
x=User()
x.fullname= 'Farbod Kamiab'
#x.id = 20030
x.name='frncskay'
x.password = 'freddy'

print x.id

Session = sessionmaker(bind=engine)

session = Session()


session.add(x)

our_user = session.query(User).filter_by(name='frncskay').first()


session.add_all([
    User(name='wendy', fullname='Wendy Williams', password='foobar'),
    User(name='mary', fullname='Mary Contrary', password='xxg527'),
    User(name='fred', fullname='Fred Flinstone', password='blah')])


x.password = 'f8s7ccs'
session.commit()
#print session.new

print x.id'''
