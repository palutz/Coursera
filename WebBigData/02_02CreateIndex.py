#
# This class aim to build a two lists index, where on the first list we have all the word
# found on our doc crawling, and then for every word we have another list, containing all the 
# reference where we found that word
#
class index:
  def Create(Docs):
    for adoc in Docs: # looping on all the docs inside the list of docs
      for w in adoc:  # looping on every words inside the doc
        i = index.lookup(w)
        if i < 0:
          j = index.add(w)   # this is a new word, add it to the index list 
          index.append(j, doc.id) # appending only the doc id (or the name) to the indexed word
        else :
          index.append(i, doc.id) # word already in the index, we add only a ref to the new doc

