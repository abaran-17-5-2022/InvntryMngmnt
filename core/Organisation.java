import java.util.ArrayList;

class Organisation {
    private String orgId;
    private final ArrayList<User> userList;
    private final ArrayList<Inventory> invList;

    protected Organisation() {
        userList = new ArrayList<>();
        invList = new ArrayList<>();
    }

    protected String getId() {
        return orgId;
    }

    private void setId(String id) {
        orgId = id;
    }

    protected Inventory getInventory(String invId) {
        for (Inventory inv : invList) {
            if (inv.getId().equals(invId)) {
                return inv;
            }
        }
        return null;
    }

    private void addInventory() {
        // todo : implement add inventory
    }

    private void addUser(User newUser) {
        userList.add(newUser);
    }

    protected User getUser(String userId) {
        for (User user : userList) {
            if (user.getId().equals(userId)) {
                return user;
            }
        }
        return null;
    }
}
