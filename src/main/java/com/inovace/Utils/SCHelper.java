package com.inovace.Utils;

import java.util.List;
import java.util.Optional;

public interface SCHelper<C,ID_T> {
     Optional<C> retrieve(ID_T id);
     List<C> retrieveALL();
     void store(C c);
     void update(C c);
     void delete(ID_T id);
}
