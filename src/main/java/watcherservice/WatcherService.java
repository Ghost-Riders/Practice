package watcherservice;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.HashMap;
import java.util.Map;

public class WatcherService {

	public static void main(String[] args) throws InterruptedException {

//		try (WatchService service = FileSystems.getDefault().newWatchService()) {
//			Map<WatchKey, Path> keyMap = new HashMap<WatchKey, Path>();
//			Path path = Paths.get("files");
//			keyMap.put(path.register(service, StandardWatchEventKinds.ENTRY_CREATE,
//					StandardWatchEventKinds.ENTRY_MODIFY, StandardWatchEventKinds.ENTRY_DELETE), path);
//			WatchKey watchKey;
//			do {
//				watchKey = service.take();
//				Path eventDir = keyMap.get(watchKey);
//
//				for (WatchEvent<?> event : watchKey.pollEvents()) {
//					WatchEvent.Kind<?> kind = event.kind();
//					Path eventPath = (Path) event.context();
//					System.out.println(eventDir + ": " + kind + ": " + eventPath);
//				}
//			} while (watchKey.reset());
//		} catch (Exception e) {
//			System.out.println("File Event Error : "+e);
//		}
	}

}
